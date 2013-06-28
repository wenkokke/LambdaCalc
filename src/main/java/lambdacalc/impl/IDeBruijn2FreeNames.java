package lambdacalc.impl;

import static com.google.common.collect.ImmutableSet.of;
import static com.google.common.collect.Sets.union;

import java.util.Set;

import lambdacalc.DeBruijn;
import lambdacalc.DeBruijn2FreeNames;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.DeBruijn.Visitor;

public final class IDeBruijn2FreeNames implements Visitor<Set<String>>, DeBruijn2FreeNames {

	@Override
	public final Set<String> freeNames(DeBruijn expr) {
		return expr.accept(this);
	}

	@Override
	public final Set<String> abstraction(Type t, DeBruijn expr) {
		return expr.accept(this);
	}

	@Override
	public final Set<String> application(final DeBruijn fun, final DeBruijn arg) {
		return union(fun.accept(this), arg.accept(this));
	}

	@Override
	public final Set<String> variable(final Index i) {
		return of();
	}

	@Override
	public Set<String> constant(Symbol s) {
		return of(s.getName());
	}

}
