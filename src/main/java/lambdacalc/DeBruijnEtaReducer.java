package lambdacalc;

public interface DeBruijnEtaReducer {
	
	/**
	 * Eta reduces lambda expressions in {@link DeBruijn} form.
	 */
	DeBruijn etaReduce(DeBruijn expr);
	
}