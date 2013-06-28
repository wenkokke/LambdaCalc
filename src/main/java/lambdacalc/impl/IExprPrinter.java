package lambdacalc.impl;

import static lambdacalc.ExprPredicate.IsVariable;
import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Expr;
import lambdacalc.ExprPrinter;
import lambdacalc.Symbol;
import lambdacalc.SymbolPrinter;
import lambdacalc.Expr.Visitor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprPrinter implements Visitor<String>, ExprPrinter {
	
	SymbolPrinter symbolPrinter;
	
	@Override
	public final String format(Expr expr) {
		return expr.accept(this);
	}
	
	@Override
	public final String application(final Expr f, final Expr a) {
		return between(f) + " " + between(a);
	}

	@Override
	public final String abstraction(final Symbol symbol, final Expr expr) {
		return "\\" + symbolPrinter.format(symbol) + "." + between(expr);
	}
	
	@Override
	public final String variable(final Symbol symbol) {
		return symbolPrinter.format(symbol);
	}
	
	// print an expression between parentheses.
	private final String between(final Expr expr) {
		return expr.accept(IsVariable) ? format(expr) : "(" + format(expr) + ")";
	}
}
