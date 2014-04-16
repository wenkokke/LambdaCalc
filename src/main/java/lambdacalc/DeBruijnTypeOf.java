package lambdacalc;

public interface DeBruijnTypeOf {
	
	/**
	 * Gets the top-level type of the expression.
	 * @param expr the expression to type
	 * @return the type
	 */
	Type typeOf(DeBruijn expr);
	
}
