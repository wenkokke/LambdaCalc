package lambdacalc;

public interface DeBruijnToClosedDomain {

	Iterable<DeBruijn> domainOf(Type t, DeBruijn exp);
	
	Iterable<DeBruijn> domainOf(Type t, DeBruijn... exps);
	
	Iterable<DeBruijn> domainOf(Type t, Iterable<DeBruijn> exps);
	
}
