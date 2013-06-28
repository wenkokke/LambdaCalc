package lambdacalc;

import lambdacalc.DeBruijn.Visitor;

public abstract class DeBruijnMatcher<X> implements Visitor<X> {

	@Override
	public X abstraction(Type type, DeBruijn body) {
		return otherwise();
	}

	@Override
	public X application(DeBruijn fun, DeBruijn arg) {
		return otherwise();
	}

	@Override
	public X variable(Index i) {
		return otherwise();
	}

	@Override
	public X constant(Symbol s) {
		return otherwise();
	}
	
	protected abstract X otherwise();

}
