package lambdacalc;

import java.util.Set;

public interface DeBruijn2FreeNames {
	
	Set<String> freeNames(final DeBruijn expr);
	
}
