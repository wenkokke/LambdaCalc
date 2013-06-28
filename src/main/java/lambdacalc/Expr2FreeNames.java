package lambdacalc;

import java.util.Set;

public interface Expr2FreeNames {
	
	Set<String> freeNames(final Expr expr);
	
}
