package lambdacalc;


public interface DeBruijnPrinter {

	/**
	 * Formats a lambda expression.
	 * 
	 * @param expr the lambda expression
	 * @return a String representation
	 */
	String format(DeBruijn expr);
}
