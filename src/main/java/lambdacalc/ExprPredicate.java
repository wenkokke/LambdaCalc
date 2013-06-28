package lambdacalc;

import lambdacalc.Expr.Visitor;


public abstract class ExprPredicate implements Visitor<Boolean> {
		
		public static class True extends ExprPredicate {
			@Override public Boolean abstraction(Symbol sym, Expr arg) { return true; }
			@Override public Boolean application(Expr fun, Expr arg) { return true; }
			@Override public Boolean variable(Symbol s) { return true; }
		}
		
		public static class False extends ExprPredicate {
			@Override public Boolean abstraction(Symbol sym, Expr arg) { return false; }
			@Override public Boolean application(Expr fun, Expr arg) { return false; }
			@Override public Boolean variable(Symbol s) { return false; }
		}
		
		public static final ExprPredicate IsAbstraction = new False() {
			@Override
			public final Boolean abstraction(final Symbol sym, final Expr arg) {
				return true;
			}
		};

		public static final ExprPredicate IsApplication = new False() {
			@Override
			public final Boolean application(final Expr fun, final Expr arg) {
				return true;
			}
		};
		
		public static final ExprPredicate IsVariable = new False() {
			@Override
			public final Boolean variable(final Symbol s) {
				return true;
			}
		};
	}