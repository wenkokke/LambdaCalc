{
 open Lexing Parser;

 exception LexicalError of string * int * int (* (message, loc1, loc2) *)

 fun lexerError lexbuf s = 
     raise LexicalError (s, getLexemeStart lexbuf, getLexemeEnd lexbuf);

 fun internalError lexbuf s =
     lexerError lexbuf ("internal error: " ^ s);

 val commentStart = ref 0;  (* Start of outermost comment being scanned *)
 
 fun commentNotClosed lexbuf =
     raise LexicalError ("Comment not terminated", 
                         !commentStart, getLexemeEnd lexbuf);
     
 val commentDepth = ref 0;  (* Current comment nesting *)

}

rule Token = parse
    [` ` `\t` `\r` `\n`] { Token lexbuf }
  | "let"               { LET }
  | "in"                { IN }
  | [`a`-`z``A`-`Z`][`a`-`z``A`-`Z``0`-`9``_`]*
                        { VAR (getLexeme lexbuf) }
  | `$`[`a`-`z``A`-`Z`][`a`-`z``A`-`Z``0`-`9``_`]*
                        { GLB (String.extract(getLexeme lexbuf, 1, NONE)) }
  | `\\`                { LAM }
  | `.`                 { DOT }
  | `;`                 { SEMI }
  | `=`                 { EQUALS }
  | `(`                 { LPAR }
  | `)`                 { RPAR }
  | "(*"                { commentStart := getLexemeStart lexbuf;
                          commentDepth := 1; 
                          SkipComment lexbuf; Token lexbuf }
  | eof                 { EOF }
  | _                   { let val c = str (getLexemeChar lexbuf 0)
			      val msg = "Illegal symbol `" ^ c ^ "' in input" 
			  in lexerError lexbuf msg end } 

and SkipComment = parse
    "*)"                { commentDepth := !commentDepth - 1;  
                          if !commentDepth = 0 then ()
                          else SkipComment lexbuf 
                        } 
   | "(*"               { commentDepth := !commentDepth + 1; 
                          SkipComment lexbuf }
   | (eof | `\^Z`)      { commentNotClosed lexbuf }
   | _                  { SkipComment lexbuf }
;
