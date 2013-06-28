package lambdacalc;


public interface ExprParser {
	
	/**
	 * Parses a lambda expression.
	 * 
	 * @param exp Lambda expression to parse.
	 * @return {@link Expr} lambda expression structure.
	 * @throws ParserException if the expression is malformed.
	 */
	Expr parse(String expr);
	
	/**
	 * Alias for {@link ExprParser#parse(String)}.
	 */
	Expr parseExpr(String expr);
	
	/**
	 * Parses a simply typed identifier.
	 * 
	 * @param symbol Symbol expression to parse.
	 * @return {@link Symbol} type expression structure.
	 * @throws ParserException if the expression is malformed.
	 */
	Symbol parseSymbol(String symbol);
	
	/**
	 * Parses a simple ET-type expression.
	 * 
	 * @param type Type expression to parse.
	 * @return {@link Type} type expression structure.
	 * @throws ParserException if the expression is malformed.
	 */
	Type parseType(String type);
}
