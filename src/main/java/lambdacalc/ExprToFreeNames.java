package lambdacalc;

import java.util.Set;

public interface ExprToFreeNames {
	
	Set<String> freeNames(final Expr expr);
	
}
