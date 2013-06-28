package lambdacalc;

public interface DeBruijnBetaReducer {
	
	/**
	 * Beta reduces lambda expressions in {@link DeBruijn} form.
	 */
	DeBruijn betaReduce(DeBruijn expr);
	
}
