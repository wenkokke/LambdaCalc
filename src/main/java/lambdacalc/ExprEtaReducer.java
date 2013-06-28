package lambdacalc;

public interface ExprEtaReducer {
	
	/**
	 * Eta reduces lambda expressions in {@link Expr} form.
	 */
	Expr etaReduce(Expr expr);
	
}