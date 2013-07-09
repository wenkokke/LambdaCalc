(* Reducers.sml, Peter Sestoft 1993-07-06, 1996-10-05, 2002-07-31

   Tracing the reduction of pure untyped lambda terms.  The redex and 
   its descendant term are labelled in each step.

   If cbnc e0 c = en
      and e0 ==> e1 ==> e2 ==> ... ==> en ==> ...
   then function c is applied to e1, e2, e3, ..., en, ...
   successively during evaluation.

   Relies on Standard ML's strict & left-to-right evaluation order.
*)

open Lambda

(* csubst c ex (e1', Lam(x,e)) builds the redex App(e1', ex), 
   labels it with the current step number, and applies c to it for the 
   side effect; then returns the reduced redex e[ex/x].  Lam(x, e) is 
   supposed to be e1' less any labels.
 *)

fun csubst c ex (e1', Lam(x, e)) = 
    let val stepno = Lambda.stepCount()
    in
	c (Lbl(stepno, App(e1', Lbl(~1, ex)))); 
	Lbl(stepno, subst(e, ex, x))
    end
  | csubst _ _ _ = raise Fail "Impossible: Reducers.csubst"

fun App1 e2 e1 = App(e1, e2)
fun App2 e1 e2 = App(e1, e2)
fun Lamx x e = Lam(x, e)
fun Lbli i e = Lbl(i, e)

fun findlam e1' appr appn =
    let fun h (Lbl(i, e))  = h e
	  | h (e as Lam _) = appr (e1', e)
	  | h _            = appn e1'
    in h e1' end

(* Call-by-name reduction to weak head normal form *)

fun cbnc env e0 c0 = 
    let fun cbnc c (Var x)       = Var x
          | cbnc c (Glb x)       = cbnc c (Env.lookup env x)
          | cbnc c (Lbl(i, e))   = Lbl(i, cbnc (c o Lbli i) e)
          | cbnc c (Lam(x, e))   = Lam(x, e)
          | cbnc c (App(e1, e2)) =
            findlam (cbnc (c o App1 e2) e1)
                    (cbnc c o csubst c e2) 
                    (App1 e2)
    in cbnc c0 e0 end

(* Normal order reduction to normal form; normalizing *)

fun norc env e0 c0 =        
    let fun norc c (Var x)       = Var x
          | norc c (Glb x)       = norc c (Env.lookup env x)
          | norc c (Lbl(i, e))   = Lbl(i, norc (c o Lbli i) e)
          | norc c (Lam (x, e))  = Lam(x, norc (c o Lamx x) e)
          | norc c (App(e1, e2)) =
            findlam (cbnc env e1 (c o App1 e2))
                    (norc c o csubst c e2)
                    (fn e1' => let val e1'' = norc (c o App1 e2) e1'
                               in App(e1'', norc (c o App2 e1'') e2) end)
    in norc c0 e0 end

(* Head spine reduction to head normal form *)

fun hsrc env e0 c0 =
    let fun hsrc c (Var x)       = Var x
          | hsrc c (Glb x)       = hsrc c (Env.lookup env x)
          | hsrc c (Lbl(i, e))   = Lbl(i, hsrc (c o Lbli i) e)
          | hsrc c (Lam(x, e))   = Lam(x, hsrc (c o Lamx x) e)
          | hsrc c (App(e1, e2)) =
            findlam (hsrc (c o App1 e2) e1)
                    (hsrc c o csubst c e2)
                    (App1 e2)
    in hsrc c0 e0 end

(* Call-by-value reduction to weak normal form *)

fun cbvc env e0 c0 =
    let fun cbvc c (Var x)       = Var x
          | cbvc c (Glb x)       = cbvc c (Env.lookup env x)
          | cbvc c (Lbl(i, e))   = Lbl(i, cbvc (c o Lbli i) e)
          | cbvc c (Lam(x, e))   = Lam(x, e)
          | cbvc c (App(e1, e2)) =
            let val e1' = cbvc (c o App1 e2) e1
                val e2' = cbvc (c o App2 e1') e2
            in 
                findlam e1' (cbvc c o csubst c e2') (App1 e2')
            end
    in cbvc c0 e0 end

(* Applicative order reduction to normal form; not normalizing *)

fun aorc env e0 c0 =
    let fun aorc c (Var x)       = Var x
          | aorc c (Glb x)       = aorc c (Env.lookup env x)
          | aorc c (Lbl(i, e))   = Lbl(i, aorc (c o Lbli i) e)
          | aorc c (Lam(x, e))   = Lam(x, aorc (c o Lamx x) e)
          | aorc c (App(e1, e2)) =
            let val e1' = aorc (c o App1 e2) e1
                val e2' = aorc (c o App2 e1') e2
            in 
                findlam e1' (aorc c o csubst c e2') (App1 e2')
            end
    in aorc c0 e0 end

(* Hybrid applicative order reduction to normal form; not normalizing *)

fun hyac env e0 c0 =
    let fun hyac c (Var x)       = Var x
          | hyac c (Glb x)       = hyac c (Env.lookup env x)
          | hyac c (Lbl(i, e))   = Lbl(i, hyac (c o Lbli i) e)
          | hyac c (Lam(x, e))   = Lam(x, hyac (c o Lamx x) e)
          | hyac c (App(e1, e2)) =
            findlam (cbvc env e1 (c o App1 e2))
                    (fn res as (e1', _) => 
                     hyac c (csubst c (hyac (c o App2 e1') e2) res))
                    (fn e1' => let val e1'' = hyac (c o App1 e2) e1'
                               in App(e1'', hyac (c o App2 e1'') e2) end)
    in hyac c0 e0 end

(* Hybrid normal order reduction to normal form; normalizing *)

fun hync env e0 c0 =        
    let fun hync c (Var x)       = Var x
          | hync c (Glb x)       = hync c (Env.lookup env x)
          | hync c (Lbl(i, e))   = Lbl(i, hync (c o Lbli i) e)
          | hync c (Lam (x, e))  = Lam(x, hync (c o Lamx x) e)
          | hync c (App(e1, e2)) =
            findlam (hsrc env e1 (c o App1 e2))
                    (hync c o csubst c e2)
                    (fn e1' => let val e1'' = hync (c o App1 e2) e1'
                               in App(e1'', hync (c o App2 e1'') e2) end)
    in hync c0 e0 end

fun println s = (print s; print "\n\n")

(* Increment step count and raise Enough with current expression if
   reaching limit *)

exception Enough of lam

fun stopat max = 
    (resetStep ();
     fn e => if stepCount () = max then raise Enough e else incrStep ())

fun exceeded max =
    println ("ERROR: Exceeded maximal step count: " ^ makestring max)
     
fun showlast e = (println "Last term was: "; Format.ppp e)

fun showsteps () = 
    let val s = stepCount()
    in 
        println (concat ["Performed ", makestring s, " beta-reduction", if s=1 then "" else "s"])
    end

(* Print the final result of reduction *)

fun show max reduce e = 
    let val incr = stopat max
        val v    = reduce e incr
    in Format.ppp v; showsteps () end
    handle Enough e => (exceeded max; showlast e)

(* Print a dot for each reduction step; print the final result *)

fun dot max reduce e = 
    let val incr = stopat max
        val v = reduce e (fn e => (print "."; incr e))
    in println ""; Format.ppp v end
    handle Enough e => (exceeded max; showlast e)
 
(* Print all steps of a reduction sequence *)

fun trace max reduce e = 
    let val incr = stopat max
        fun ppreduces e = (Format.ppp e; print "\n==> "; incr e)
        val e' = reduce e ppreduces
    in Format.ppp e'; showsteps () end
    handle Enough _ => exceeded max
 
(* Print all steps of a reduction sequence, labelling each term *)

fun tracelabel max reduce e = 
    let val incr = stopat max
        fun ppreduces e = (Format.ppplabels e; print "\n==> "; incr e)
        val e' = reduce e ppreduces
    in Format.ppplabels e'; showsteps() end
    handle Enough _ => exceeded max

(* Print the number of reduction steps *)

fun count max reduce e = 
    let val incr = stopat max
        val v = reduce e incr
    in showsteps () end
    handle Enough e => (exceeded max; showlast e)

(* Perform a single reduction step; show the resulting term *)

fun single stepno reduce e = 
    let val incr = stopat stepno
        val e'   = reduce e incr
    in Format.ppp e' end
    handle Enough e' => Format.ppp e';

(* Perform a single reduction step more; show all intermediate results *)

fun singleall stepno reduce e = 
    let val incr = stopat stepno
        fun ppreduces e = (incr e; Format.pppsingleall e; print "\n==> ")
        val e'   = reduce e ppreduces
    in Format.pppsingleall e' end
    handle Enough e' => Format.pppsingleall e'
