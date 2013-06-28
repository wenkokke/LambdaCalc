package lambdacalc;

public interface Expr2Type {
	
	/**
	 * Gets the top-level type of the expression.
	 * @param expr the expression to type
	 * @return the type
	 */
	Type typeOf(Expr expr);
	
}
