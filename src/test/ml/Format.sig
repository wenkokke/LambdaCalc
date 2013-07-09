(* Format.sig *)

val expression   : string

val ppp          : Lambda.lam -> unit
val pppsingleall : Lambda.lam -> unit
val ppplabels    : Lambda.lam -> unit
val ppabbrev     : (string * Lambda.lam) -> Msp.wseq
