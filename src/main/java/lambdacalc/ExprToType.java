package lambdacalc;

public interface ExprToType {
	
	/**
	 * Gets the top-level type of the expression.
	 * @param expr the expression to type
	 * @return the type
	 */
	Type typeOf(Expr expr);
	
}
