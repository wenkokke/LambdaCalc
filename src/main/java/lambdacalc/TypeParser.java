package lambdacalc;


public interface TypeParser {
	
	/**
	 * Parses a lambda type.
	 * 
	 * @param exp Lambda expression to parse.
	 * @return {@link DeBruijn} lambda expression structure.
	 * @throws ParserException When the expression is malformed.
	 */
	Type parse(String type);
}
