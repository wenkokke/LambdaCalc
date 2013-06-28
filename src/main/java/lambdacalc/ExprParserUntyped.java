package lambdacalc;


public interface ExprParserUntyped {
	
	/**
	 * Parses an untyped lambda expression.
	 * 
	 * @param exp Lambda expression to parse.
	 * @return {@link Expr} lambda expression structure.
	 * @throws ParserException if the expression is malformed.
	 */
	Expr parseUntypedExpr(String expr);
	
	/**
	 * Parses an untyped identifier.
	 * 
	 * @param symbol Symbol expression to parse.
	 * @return {@link Symbol} type expression structure.
	 * @throws ParserException if the expression is malformed.
	 */
	Symbol parseUntypedSymbol(String symbol);
	
}
