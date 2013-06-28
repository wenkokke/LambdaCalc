package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestTypeChecker extends TestLambdaCalc {

	@Test
	public final void example1() {
		typeIs("(\\A:et.\\B:et.\\x:e.AND:ttt (A:et x:e) (B:et x:e)) ate:et", "(et)et");
		typeIs("(\\A:et.\\B:et.\\x:e.AND:ttt (A:et x:e) (B:et x:e)) ate:et", "(et)et");
	}
	
	private final void typeIs(final String expr, final String type) {
		val exp1  = stl.toDeBruijn(stl.parseExpr(expr));
		val typ11 = stl.checkType(exp1);
		val typ12 = stl.checkType(stl.betaReduce(exp1));
		val typ2  = stl.parseType(type);
		assertEquals(typ11,typ2);
		assertEquals(typ12,typ2);
	}
	
}
