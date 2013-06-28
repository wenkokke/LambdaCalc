package lambdacalc;

import lambdacalc.Expr.Visitor;

import com.google.common.base.Optional;

public class ExprNone<X> implements Visitor<Optional<X>> {
	@Override public Optional<X> abstraction(Symbol s, Expr body) { return Optional.absent(); }
	@Override public Optional<X> application(Expr fun, Expr arg)  { return Optional.absent(); }
	@Override public Optional<X> variable(Symbol s)               { return Optional.absent(); }	
}