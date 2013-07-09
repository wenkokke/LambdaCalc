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
			val red1 = print(parse(red.reduce(exp)));
			val red2 = print(stl.betaReduce(parse(exp)));
			if (! red1.equals(red2)) {
				System.err.printf("Expression: %s\nExpected: %s\nActual: %s\n", exp, red1, red2);
			}
		}
	}
	
	private final DeBruijn parse(String expr) {
		return stl.toDeBruijn(stl.parseUntypedExpr(expr));
	}
	
	private final String print(DeBruijn expr) {
		return stl.format(stl.fromDeBruijn(expr));
	}

}
