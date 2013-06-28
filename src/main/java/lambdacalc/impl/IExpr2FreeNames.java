package lambdacalc.impl;

import static com.google.common.collect.ImmutableSet.of;
import static com.google.common.collect.Sets.union;
import static com.google.common.collect.Sets.difference;

import java.util.Set;

import lambdacalc.Expr;
import lambdacalc.Expr2FreeNames;
import lambdacalc.Symbol;
import lambdacalc.Expr.Visitor;

public final class IExpr2FreeNames implements Visitor<Set<String>>, Expr2FreeNames {

	@Override
	public final Set<String> freeNames(Expr expr) {
		return expr.accept(this);
	}

	@Override
	public final Set<String> abstraction(Symbol s, Expr body) {
		return difference(body.accept(this),of(s.getName()));
	}

	@Override
	public final Set<String> application(final Expr fun, final Expr arg) {
		return union(fun.accept(this), arg.accept(this));
	}

	@Override
	public final Set<String> variable(final Symbol symbol) {
		return of(symbol.getName());
	}

}
