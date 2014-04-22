package lambdacalc;

public interface DeBruijnToClosedDomain {

	Iterable<DeBruijn> domainOf(Type t, DeBruijn e);
	
}
