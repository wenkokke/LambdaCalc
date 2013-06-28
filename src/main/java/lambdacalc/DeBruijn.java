package lambdacalc;


public interface DeBruijn {
	<X> X accept(Visitor<X> v);
	
	public interface Visitor<X> {
		X abstraction(Type type, DeBruijn body); // expression body
		X application(DeBruijn fun, DeBruijn arg); // function and arguments
		X variable(Index i); // a debruijn index
		X constant(Symbol s); // a typed symbol
	}
}
