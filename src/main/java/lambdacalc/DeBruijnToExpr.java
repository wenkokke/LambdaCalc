package lambdacalc;

public interface DeBruijnToExpr {
	
	Expr fromDeBruijn(DeBruijn expr);
	
}
