(* Env.sml, Peter Sestoft 1996 *)

open Lambda

exception Env of string

type env = (string, lam) Polyhash.hash_table

val empty : env = Polyhash.mkPolyTable (37, Subscript)

(* Replace environment-bound variables (Var x) by globals (Glb x).
   The distinction between Var and Glb prevents capture of Glbs in
   substitutions.
 *)

fun mkglobal freevar env e = 
    let fun glob (e as Var x) lambound =
	    if List.exists (fn y => x=y) lambound then e
	    else
		(case Polyhash.peek env x of
		     SOME _ => Glb x
		   | NONE   => freevar x)
	  | glob (e as Glb x) lambound =
	    (case Polyhash.peek env x of
		 SOME _ => Glb x
	       | NONE   => raise Env (concat 
				      ["ERROR: No abbreviation called `", 
				       x, "'"]))
	  | glob (Lam(x, e)) lambound =
	    Lam(x, glob e (x :: lambound))
	  | glob (App(e1, e2)) lambound =
	    App(glob e1 lambound, glob e2 lambound)
	  | glob _ _ = raise Internal "Env.glob"
    in glob e [] end

(* Extend the environment env with the equation 
	id = e
   Any free variable (Var x) in e must be bound in env, and will be replaced 
   by (Glb x).  The check prevents circular definitions. 
*)

fun addenv ((id, e), env) = 
    let fun freevar x = 		     
	    raise Env (concat ["ERROR: Free variable `", x, 
			       "' in abbreviation `", id, "'"])
    in 
	(case Polyhash.peek env id of
	     SOME _ => raise Env ("ERROR: Abbreviation `" ^ id ^ "' rebound")
	   | NONE   => Polyhash.insert env (id, mkglobal freevar env e));
	env
    end 

fun lookup env id = Polyhash.find env id

fun printenv env = 
    let open Msp
	fun compare ((id1,_), (id2,_)) = String.compare (id1, id2)
	val binds = Listsort.sort compare (Polyhash.listItems env)
    in printseq (prsep Empty Format.ppabbrev binds) end
