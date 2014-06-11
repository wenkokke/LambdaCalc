package lambdacalc;

public interface ExprRichBuilder extends ExprBuilder {
	
	public Expr variable(String name, Type type);
	public Expr abstraction(String name, Type type, Expr body);
	public Expr application(Expr... exprs);
	public Expr parse(String rawExpr);

}
