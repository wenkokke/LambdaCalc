package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import static org.codehaus.jparsec.Parsers.or;
import static org.codehaus.jparsec.Parsers.sequence;
import static org.codehaus.jparsec.Scanners.isChar;

import java.util.List;

import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.ExprParser;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.TypeBuilder;
import lambdacalc.Types;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Scanners;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Map2;
import org.codehaus.jparsec.functors.Map3;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprParser implements ExprParser {
	
	TypeBuilder typeBuilder;
	ExprBuilder exprBuilder;

	@Override
	public final Expr parse(String expr) {
		return pExpr.parse(expr);
	}

	@Override
	public final Expr parseExpr(String expr) {
		return pExpr.parse(expr);
	}

	@Override
	public final Symbol parseSymbol(String symbol) {
		return pSymbol.parse(symbol);
	}

	@Override
	public final Type parseType(String type) {
		return pType.parse(type);
	}
	
	@NonFinal static Parser<Type> pType;
	{{
		val pRef = Parser.<Type> newReference();
		val pE   = isChar('e').retn(Types.E);
		val pT   = isChar('t').retn(Types.T);
		val pVal = or(pE,pT,pRef.lazy().between(isChar('('),isChar(')')));
		val pApp = sequence(pVal,pRef.lazy(),new Map2<Type,Type,Type>() {
			@Override
			public final Type map(final Type a, final Type b) {
				return typeBuilder.function(a, b);
			}
		});
		pType = or(pApp,pVal);
		pRef.set(pType);
	}}
	
	@NonFinal static Parser<Symbol> pSymbol;
	{{
		pSymbol = sequence(
			Scanners.IDENTIFIER,isChar(':'),pType,
			new Map3<String,Void,Type,Symbol>() {
				@Override
				public final Symbol map(String name, Void _, Type type) {
					return new ISymbol(name,type);
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
