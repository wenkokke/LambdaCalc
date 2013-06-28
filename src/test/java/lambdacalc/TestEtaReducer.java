package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestEtaReducer extends TestLambdaCalc {
	
	@Test
	public final void example1() {		
		reducesTo(
			"\\x:e.walks:et x:e",
			"walks:et");
	}
	
	@Test
	public final void example2() {
		reducesTo(
			"EXISTS:(et)t (\\x0:e.((AND:ttt ((AND:ttt ((AND:ttt (man:et x0:e)) (dutch:et x0:e))) (black:et x0:e))) ((EQ:eet x0:e) jan:e)))",
			"EXISTS:(et)t (\\x0:e.((AND:ttt ((AND:ttt ((AND:ttt (man:et x0:e)) (dutch:et x0:e))) (black:et x0:e))) ((EQ:eet x0:e) jan:e)))");
	}

	private final void reducesTo(final String exp1, final String exp2) {
		val red1 = stl.format(stl.etaReduce(stl.toDeBruijn(stl.parse(exp1))));
		val red2 = stl.format(stl.toDeBruijn(stl.parse(exp2)));
		assertEquals(red2,red1);
	}
	
}
