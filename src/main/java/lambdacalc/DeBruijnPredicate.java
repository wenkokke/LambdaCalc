package lambdacalc;

import lambdacalc.DeBruijn.Visitor;

public abstract class DeBruijnPredicate implements Visitor<Boolean> {
		
		public static class True extends DeBruijnPredicate {
			@Override public Boolean abstraction(Type type, DeBruijn body)          { return true; }
			@Override public Boolean application(DeBruijn fun, DeBruijn arg) { return true; }
			@Override public Boolean variable(Index i)             { return true; }
			@Override public Boolean constant(Symbol s)              { return true; }
		}
		
		public static class False extends DeBruijnPredicate {
			@Override public Boolean abstraction(Type type, DeBruijn body)          { return false; }
			@Override public Boolean application(DeBruijn fun, DeBruijn arg) { return false; }
			@Override public Boolean variable(Index i)             { return false; }
			@Override public Boolean constant(Symbol s)              { return false; }
		}
		
		public static final DeBruijnPredicate IsAbstraction = new False() {
			@Override
			public final Boolean abstraction(final Type type, final DeBruijn deBruijn) {
				return true;
			}
		};
		
		public static final DeBruijnPredicate IsApplication = new False() {
			@Override
			public final Boolean application(final DeBruijn l, final DeBruijn r) {
				return true;
			}
		};
		
		public static final DeBruijnPredicate IsVariable = new False() {
			@Override
			public final Boolean variable(Index i) {
				return true;
			}
		};
		
		public static final DeBruijnPredicate IsConstant = new False() {
			@Override
			public final Boolean constant(Symbol s) {
				return true;
			}
		};
	}