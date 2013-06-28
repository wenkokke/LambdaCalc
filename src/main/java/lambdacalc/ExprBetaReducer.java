package lambdacalc;

public interface ExprBetaReducer {
	
	/**
	 * Beta reduces lambda expressions in {@link Expr} form.
	 */
	Expr betaReduce(Expr expr);

}
