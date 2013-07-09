(* Env.sig *)

exception Env of string

type env

val empty    : env   
val addenv   : (string * Lambda.lam) * env -> env
val lookup   : env -> string -> Lambda.lam

val mkglobal : (string -> Lambda.lam) -> env -> Lambda.lam -> Lambda.lam

val printenv : env -> unit
