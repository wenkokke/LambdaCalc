package lambdacalc;


import lambdacalc.DeBruijn.Visitor;

import com.google.common.base.Optional;

public class DeBruijnNone<X> implements Visitor<Optional<X>> {
	@Override public Optional<X> abstraction(Type type, DeBruijn body)          { return Optional.absent(); }
	@Override public Optional<X> application(DeBruijn fun, DeBruijn arg) { return Optional.absent(); }
	@Override public Optional<X> variable(Index i)             { return Optional.absent(); }
	@Override public Optional<X> constant(Symbol s)              { return Optional.absent(); }	
}