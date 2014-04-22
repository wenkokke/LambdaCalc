package lambdacalc;

public interface DeBruijnRichBuilder extends DeBruijnBuilder {

	public DeBruijn variable(Integer index, Type type);
	public DeBruijn constant(String name, Type type);
	public DeBruijn application(DeBruijn... exprs);
	public DeBruijn abstraction(DeBruijn expr, Type... types);
	public DeBruijn parse(String rawExpr);
	
}
