# Makefile for lamreduce

MOSMLHOME=${HOME}/mosml
MOSMLTOOLS=camlrunm $(MOSMLHOME)/tools
MOSMLC=mosmlc -c -P full
MOSMLL=mosmlc -I -P full
MOSMLLEX=mosmllex
MOSMLYACC=mosmlyac
#WWWCGIBIN=/pack/www/cgi-bin
WWWCGIBIN=/var/www/cgi-bin
#WWWCGIBIN=/var/lib/httpd/cgi-bin
CPP=/lib/cpp -P -traditional -Dunix -Umsdos
COMPFLAGS=-liberal
all: parts lamreduce

parts: Env.uo Format.uo Lambda.uo LamReduce.uo Parser.uo Reducers.uo 

lamreduce: parts 
	mosmlc -o lamreduce.exe LamReduce.sml

Parser.sml Parser.sig: Parser.grm
	$(MOSMLYACC) Parser.grm

.SUFFIXES :
.SUFFIXES : .sml .sig .ui .uo .mlp .lex .c .o

.sig.ui:
	$(MOSMLC) $(COMPFLAGS) $<

.sml.uo:
	$(MOSMLC) $(COMPFLAGS) $<

.mlp.sml:
	$(CPP) $< > $*.sml

.lex.sml:
	$(MOSMLLEX) $<

depend: Lexer.sml Parser.sml 
	rm -f Makefile.bak
	mv Makefile Makefile.bak
	$(MOSMLTOOLS)/cutdeps < Makefile.bak > Makefile
	$(MOSMLTOOLS)/mosmldep >> Makefile

clean:
	rm -f Parser.sig Parser.sml Lexer.sml
	rm -f lamreduce
	rm -f *.ui
	rm -f *.uo
	rm -f Makefile.bak
	rm -f *.exe

### DO NOT DELETE THIS LINE
Parser.ui: Lambda.uo 
Parser.uo: Parser.ui Lambda.uo 
Lexer.uo: Parser.ui 
Env.uo: Env.ui Format.ui Lambda.uo 
Format.ui: Lambda.uo 
Env.ui: Lambda.uo 
Reducers.ui: Env.ui Lambda.uo 
Format.uo: Format.ui Lambda.uo 
Reducers.uo: Reducers.ui Format.ui Env.ui Lambda.uo 
Main.uo: Parser.ui Format.ui Lexer.uo Env.ui Lambda.uo Reducers.ui 
LamReduce.uo: Parser.ui Format.ui Lexer.uo Env.ui Lambda.uo Reducers.ui 
