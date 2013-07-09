(* Lambda, Peter Sestoft 1996 *)

exception Internal of string

datatype lam =
    Var of string			(* lambda-bound or free *)
  | Glb of string			(* environment bound    *)
  | Lam of string * lam			(* abstraction          *)
  | App of lam * lam			(* application          *)
  | Lbl of int * lam			(* labelled term        *)

(* Free variables, substitution and renaming *)

fun freein (x, Var y)        = (x=y)
  | freein (x, Glb y)        = false
  | freein (x, Lam (y, e))   = (x<>y) andalso freein(x, e)
  | freein (x, App (e1, e2)) = freein(x, e1) orelse freein(x, e2)
  | freein (x, Lbl(_, e1))   = freein(x, e1)

local val c = ref 0
in fun new x = (c := !c+1; x ^ makestring (!c)) end

(* subst(e, ex, x) computes e[ex/x], renaming bound variables as necessary *)

fun subst (Var y,        ex, x) = if x=y then ex else Var y
  | subst (Glb y,        ex, x) = Glb y
  | subst (Lam (y, e),   ex, x) = 
    if x=y then 
	Lam (y, e) 
    else if freein(y, ex) andalso freein(x, e) then
	let val y1 = new y
	in Lam(y1, subst(subst(e, Var y1, y), ex, x)) end
    else 
	Lam (y, subst(e, ex, x))
  | subst (App (e1, e2), ex, x) = App (subst(e1, ex, x), subst(e2, ex, x))
  | subst (Lbl(i, e1),  ex, x)  = Lbl(i, subst(e1, ex, x))

local 
    val stepno = ref 0
in 
    fun resetStep () = stepno := 0
    fun stepCount () = !stepno
    fun incrStep () = stepno := !stepno + 1
end

val ** = App
infix ** 

val binds0 =
    let val a = Var "a"
	val f = Var "f"
	val g = Var "g"
	val h = Var "h"
	val m = Var "m"
	val n = Var "n"
	val p = Var "p"
	val s = Var "s"
	val x = Var "x"
	val y = Var "y"
	val z = Var "z"
	val w = Var "w"
	val fal = Var "fal"
	val tru = Var "tru"
	val iszero = Var "iszero"
	val pair = Var "pair"
	val fst = Var "fst"
	val snd = Var "snd"
	val next = Var "next"
	val pred = Var "pred"
	val zero = Var "zero"
	val one = Var "one"
	val succ = Var "succ"
	val add = Var "add"
	val mul = Var "mul"
	val cons = Var "cons"
	val null = Var "null"
	val hd = Var "hd"
	val tl = Var "tl"
    in
    [(* Combinators *)
     ("S", Lam ("f",Lam("g",Lam("x", f ** x ** (g ** x))))),
     ("K", Lam ("x", Lam("y", Var "x"))),
     ("I", Lam ("x", Var "x")),
     ("Omega", Lam ("x", x ** x) ** Lam ("x", x ** x)),
     (* Encoding natural numbers *)
     ("zero", Lam("f", Lam("x", x))), 
     ("one", Lam("f", Lam("x", f ** x))), 
     ("two", Lam("f", Lam("x", f ** (f ** x)))), 
     ("three", Lam("f", Lam("x", f ** (f ** (f ** x))))), 
     ("four", Lam("f", Lam("x", f ** (f ** (f ** (f ** x)))))), 
     ("five", Lam("f", Lam("x", f ** (f ** (f ** (f ** (f ** x))))))),
     ("succ", Lam("n", Lam("f", Lam("x", f ** (n ** f ** x))))),
     ("add", Lam("m", Lam("n", Lam("f", Lam("x", m ** f ** (n ** f ** x)))))),
     ("mul", Lam("m", Lam("n", Lam("f", Lam("x", m ** (n ** f) ** x))))), 
     ("exp", Lam("m", Lam("n", Lam("f", Lam("x", m ** n ** f ** x))))),
     (* Encoding Boolean values *)
     ("tru", Lam("x", Lam("y", x))),
     ("fal", Lam("x", Lam("y", y))),
     ("iszero", Lam("n", n **  Lam("v",fal) ** tru)),
     (* Encoding pairs *)
     ("pair", Lam("x", Lam("y", Lam("s", s ** x ** y)))),
     ("fst", Lam("p", p ** tru)),
     ("snd", Lam("p", p ** fal)),
     (* Encoding lists a la Paulson *)
     ("nil", Lam("z", z)),
     ("cons", Lam("x", Lam("y", pair ** fal ** (pair ** x ** y)))),
     ("null", fst),
     ("hd", Lam("z", fst ** (snd ** z))),
     ("tl", Lam("z", snd ** (snd ** z))),
     (* Encoding recursive definitions (for normal order) *)
     ("Y", let val A = Lam ("x", h ** (x ** x))
	   in Lam ("h", A ** A) end),
     ("YT", let val A = Lam("x", Lam("y",y ** (x ** x ** y)))      (* Turing *)
	    in A ** A end),
     ("next", Lam("p", pair ** (snd ** p) ** (succ ** (snd ** p)))),
     ("pred", Lam("n", fst ** (n ** next ** (pair ** zero ** zero)))),
     ("F", Lam("f", 
	       Lam("n", 
		   (iszero ** n)
		   ** one
		   ** (mul ** n ** (f ** (pred ** n)))))),
     ("append", App(Var "Y", Lam("g", Lam("z", 
					  Lam("w", null ** z
					      ** w
					      ** (cons ** (hd ** z) 
						  ** (g ** (tl ** z) ** w))))))),
     (* Special encodings for call-by-value *)
     ("Yv", let val A = Lam("x", Lam("a", h ** (x ** x) ** a))     (* Reade *)
	    in Lam ("h", A ** A) end),
     ("Fv", Lam("f", 
		Lam("n", 
		    (iszero ** n) 
		    ** (Lam("d", one))
		    ** (Lam("d", mul ** n ** (f ** (pred ** n))))
		    ** (Lam("d", Var "d"))))),
     ("Yp", let val A = Lam("x", h ** Lam("a", x ** x ** a))     (* Paulson *)
	    in Lam ("h", A ** A) end)]
    end;
