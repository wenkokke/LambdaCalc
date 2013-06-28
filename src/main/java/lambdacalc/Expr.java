package lambdacalc;

public interface Expr {
	<X> X accept(Visitor<X> v);
	
	public interface Visitor<X> {
		X abstraction	(Symbol s, Expr body);        // expression body
		X application	(Expr fun, Expr arg);	// function and arguments
		X variable		(Symbol s);			                // a typed symbol
	}
}
