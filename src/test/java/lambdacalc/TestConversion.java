package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestConversion extends TestLambdaCalc {
	
	@Test
	public final void constant1() {
		val exp = "x:e";
		identity(exp);
		convertsTo(exp,exp);
	}
	@Test
	public final void abstraction1() {
		val exp = "\\x:e.x:e";
		identity(exp,"\\x0:e.x0:e");
		convertsTo(exp,"[e] 0:e");
	}
	@Test
	public final void application1() {
		val exp = "f:et x:e";
		identity(exp,"f:et x:e");
		convertsTo(exp,"(f:et) (x:e)");
	}
	@Test
	public final void application2() {
		val exp = "(\\x:e.x:e) x:e";
		identity(exp,"(\\x0:e.x0:e) x:e");
		convertsTo(exp,"([e] 0:e) (x:e)");
	}
	
	private final void identity(final String exp1) {
		val red1 = stl.format(stl.fromDeBruijn(stl.toDeBruijn(stl.parse(exp1))));
		assertEquals(exp1,red1);
	}
	
	private final void identity(final String exp1,final String exp2) {
		val red1 = stl.format(stl.fromDeBruijn(stl.toDeBruijn(stl.parse(exp1))));
		assertEquals(exp2,red1);
	}
	
	private final void convertsTo(final String exp1, final String exp2) {
		val red1 = stl.format(stl.toDeBruijn(stl.parse(exp1)));
		assertEquals(exp2,red1);
	}
	
}
