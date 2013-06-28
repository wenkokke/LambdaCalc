package lambdacalc;


public interface ExprPrinter {

	/**
	 * Formats a lambda expression.
	 * 
	 * @param expr the lambda expression
	 * @return a String representation
	 */
	String format(Expr expr);
}
