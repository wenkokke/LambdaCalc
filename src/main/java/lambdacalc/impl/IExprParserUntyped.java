package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import static org.codehaus.jparsec.Parsers.sequence;
import static org.codehaus.jparsec.Scanners.isChar;

import java.util.List;

import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.ExprParserUntyped;
import lambdacalc.Symbol;
import lambdacalc.Types;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Scanners;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Map3;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprParserUntyped implements ExprParserUntyped {
	
	ExprBuilder exprBuilder;

	@Override
	public final Expr parseUntypedExpr(String expr) {
		return pExpr.parse(expr);
	}

	@Override
	public final Symbol parseUntypedSymbol(String symbol) {
		return pSymbol.parse(symbol);
	}
	
	@NonFinal static Parser<Symbol> pSymbol;
	{{
		pSymbol = 
			Scanners.IDENTIFIER.map(
			new Map<String,Symbol>() {
				@Override
				public final Symbol map(String name) {
					return new ISymbol(name,Types.STAR);
				}
			});
	}}
	
	@NonFinal static Parser<Expr> pExpr;
	{{
		val pRef = Parser.<Expr> newReference();
		val pVar = pSymbol.map(new Map<Symbol,Expr>() {
			@Override
			public final Expr map(Symbol s) {
				return exprBuilder.variable(s);
			}
		});
		val pAbs = sequence(isChar('\\').next(pSymbol),isChar('.'),pRef.lazy(),
			new Map3<Symbol,Void,Expr,Expr>() {
				@Override
				public final Expr map(Symbol x, Void _, Expr e1) {
					return exprBuilder.abstraction(x, e1);
				}
			});
		val ATOM = pVar.or(pAbs).or(pRef.lazy().between(isChar('('), isChar(')')));
		val pApp = ATOM.sepBy1(isChar(' ')).map(new Map<List<Expr>,Expr>() {
			@Override
			public final Expr map(final List<Expr> atoms) {
				Expr expr = atoms.remove(0);
				while (! atoms.isEmpty()) {
					expr = exprBuilder.application(expr, atoms.remove(0));
				}
				return expr;
			}
		});
		pExpr = pApp;
		pRef.set(pExpr);
	}}

}
