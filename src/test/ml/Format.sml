(* Format.sml, Peter Sestoft 1993-07-06, 1996-09-29, 2002-07-31 *)

open Lambda Msp
infix &&

(* Printing lambda expressions with hyperlinks and labels *)

val lam = $ "\\"
val dot = $ "."
val $$$ = $ "$"

(* Add parentheses, brackets, or quotes; without leading space *)

fun prpar obj = $ "(" && obj && $ ")"
fun prbra obj = $ "[" && obj && $ "]"
fun prquo obj = $ "'" && obj && $ "'"

val evalorder  = getOpt (Mosmlcgi.cgi_field_string "evalorder", "MISSING")
val expression = getOpt (Mosmlcgi.cgi_field_string "expression", "MISSING")

val evalordws = urlencode evalorder
val exprws    = urlencode expression

fun cgicall prog []     = prog
  | cgicall prog params = 
    flatten ($$[prog, "?"]
	     && prsep ($ "&") (fn (par, arg) => $$[par, "=", arg]) params)

fun redex action ws = 
    let val call =
	    cgicall "/cgi-bin/sestoft/lamreduce"
	    [("action",     action),
	     ("expression", exprws),
	     ("evalorder",  evalordws),
	     ("stepno",     Int.toString (1 + Lambda.stepCount()))]
    in ahref call ws end

(* fun redex action ws = ws *)

(* Lbl(~1, e) signifies the current argument, to be shown in italics *)

fun prlabelsingle i ws =
    if i = Lambda.stepCount() then 
	redex "singlestep" ws
    else if i = ~1 then
	em ws
    else 
	ws

fun prlabelsingleall i ws =
    if i = Lambda.stepCount() then 
	redex "singlestep (show all)" ws
    else if i = ~1 then 
	em ws
    else 
	ws

fun prlabelall ~1 ws = em ws
  | prlabelall i ws  = 
    let fun parOpt ($"(" && _ && $")") = ws (* Parenthesized already      *)
	  | parOpt ($ _)               = ws (* Variable or global         *)
	  | parOpt _                   = prbra ws (* Label or application *)
    in parOpt ws && sup ($ (makestring i)) end 

fun printterm prlabel e = 
    let (* ppw  : Printing (and marking) lambda terms.
	   ppwl : In rator position (left), abstractions must be parenthesized
	   ppwr : In rand position (right), variables need not be parenthesized
	 *)
	fun ppw (Var x)       = $ x
	  | ppw (Glb x)       = $ ("$" ^ x)
	  | ppw (Lam(x, e))   = lam && $ x && dot && ppw e 
	  | ppw (App(e1, e2)) = ppwl e1 && $ " " && ppwr e2
	  | ppw (Lbl(i, e))   = prlabel i (ppw e)
	and ppwl (e as Lam _) = prpar (ppw e)
	  | ppwl (Lbl(i, e))  = prlabel i (ppwl e)
	  | ppwl e            = ppw e
	and ppwr (e as Var _) = ppw e
	  | ppwr (e as Glb _) = ppw e
	  | ppwr e            = prpar (ppw e)
    in ppw e end

(* Printing lambda expressions as linear strings (HTML): *)

fun ppp e = printseq (printterm prlabelsingle e && ($ "\n"))

fun pppsingleall e = printseq (printterm prlabelsingleall e && ($ "\n"))

fun ppplabels e = printseq (printterm prlabelall e && ($ "\n"))

(* Printing abbreviations as linear strings (HTML): *)

fun ppabbrev (id, e) = 
    $ id && $ " = " && printterm (fn _ => fn ws => ws) e && ($ "\n")
