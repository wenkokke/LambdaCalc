package lambdacalc;

public interface DeBruijnRenamer {

	/**
	 * Renames a free term in a lambda expression.
	 * 
	 * <pre>
	 * subst "y" "x" (y); // (x) 
	 * </pre>
	 */
	DeBruijn rename(String from, String to, DeBruijn subject);
	
}
