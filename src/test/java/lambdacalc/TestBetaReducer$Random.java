package lambdacalc;

import static lombok.AccessLevel.PRIVATE;

import java.io.IOException;

import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class TestBetaReducer$Random {

	Integer		seed;
	LambdaGen	gen;
	LambdaRed	red;
	STL			stl;
	
	public final void quickCheck() throws IOException, InterruptedException {
		for (val exp: gen.generate(seed, 100)) {
			System.err.println("-----------------------------------------------");
			
			if (exp!=null) {
				System.err.println("exp = [" + exp+"]");

				String printableParseRedExp = null;
				val redExp = red.reduce(exp);
				if (redExp!=null) {
					if (redExp.startsWith("Uncaught")) {
						System.err.println("Error: reducer returned: [" + redExp + "]");
					} else {
						System.err.println("red exp = [" + redExp+"]");
						val parseRedExp = parse(red.reduce(exp));
						if (parseRedExp!=null) {
							printableParseRedExp = print(parseRedExp);
							System.err.println("parsed red exp = [" + printableParseRedExp+"]");
						} else {
							System.err.println("parsed red exp is NULL");
						}
					}
				} else {
					System.err.println("red exp is NULL");
				}
				
				String printableReducedParsedExp = null;
				val parsedExp = parse(exp);
				if (parsedExp!=null) {
					val reducedParsedExp = stl.betaReduce(parsedExp);
					if (reducedParsedExp!=null) {
						printableReducedParsedExp = print(reducedParsedExp);
						System.err.println("reduced parsed exp = [" + printableReducedParsedExp+"]");
					} else {
						System.err.println("reduced parsed exp is NULL");
					}
				} else {
					System.err.println("parsed exp is NULL");
				}

				
				if (printableParseRedExp!=null && printableReducedParsedExp!=null) {
					if (! printableParseRedExp.equals(printableReducedParsedExp)) {
						//System.err.printf("Expression: %s\nExpected: %s\nActual: %s\n", exp, printableParseRedExp, printableReducedParsedExp);
						System.err.println("Reductions do NOT match!");
					} else {
						System.err.println("Reductions match!");
					}
					
				}
				
			} else {
				System.err.println("exp is NULL");
			}
			
			/*			
			val red1 = print(parse(red.reduce(exp)));
			val red2 = print(stl.betaReduce(parse(exp)));
			if (! red1.equals(red2)) {
				System.err.printf("Expression: %s\nExpected: %s\nActual: %s\n", exp, red1, red2);
			}*/
		}
	}
	
	private final DeBruijn parse(String expr) {
		return stl.toDeBruijn(stl.parseUntypedExpr(expr));
	}
	
	private final String print(DeBruijn expr) {
		return stl.format(stl.fromDeBruijn(expr));
	}

}