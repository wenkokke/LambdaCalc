(* Main2, Pepijn Kokke 2013 *)

open Lambda
open Reducers

fun handler (Lambda.Internal s)          = print ("Internal error: " ^ s)
  | handler (Fail s)                     = print ("Failure: " ^ s)
  | handler (Parsing.ParseError _)       = print ("Parse error: `" ^ Format.expression ^ "'")
  | handler (Lexer.LexicalError (s,_,_)) = print ("Lexical error: " ^ s)
  | handler (Env.Env s)                  = print s
  | handler exn                          = raise exn

fun readlam s = Parser.Input Lexer.Token (Lexing.createLexerString s)

val env0 = foldl Env.addenv Env.empty Lambda.binds0

fun main () =
    let val lamoption    = TextIO.inputLine TextIO.stdIn
        val maxstep      = 4000
        val (binds, lam) = readlam lamoption
        val env          = foldl Env.addenv env0 binds
        val lam          = Env.mkglobal Var env lam
    in (show maxstep) (norc env) lam
    end
    
val _ = main()
