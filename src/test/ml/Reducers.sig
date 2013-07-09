(* Reducers *)

local 
    type lam = Lambda.lam 
    type reducer = lam -> (lam -> unit) -> lam
in
    (* Reducers *)
    val cbnc : Env.env -> reducer
    val norc : Env.env -> reducer
    val hsrc : Env.env -> reducer
    val cbvc : Env.env -> reducer
    val aorc : Env.env -> reducer
    val hyac : Env.env -> reducer
    val hync : Env.env -> reducer
	
    (* Tracers *)
    val show       : int -> reducer -> lam -> unit
    val dot        : int -> reducer -> lam -> unit
    val trace      : int -> reducer -> lam -> unit
    val tracelabel : int -> reducer -> lam -> unit
    val count      : int -> reducer -> lam -> unit
    val single     : int -> reducer -> lam -> unit
    val singleall  : int -> reducer -> lam -> unit
end

