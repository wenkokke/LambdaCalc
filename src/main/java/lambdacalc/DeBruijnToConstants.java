package lambdacalc;

import java.util.Set;

public interface DeBruijnToConstants {
	
	Set<String> constants(final DeBruijn expr);
	
}
