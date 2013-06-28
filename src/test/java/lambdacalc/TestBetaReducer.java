package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestBetaReducer extends TestLambdaCalc {
	
	@Test
	public final void nestedApplication() {
		reducesTo(
			"R:eet ((\\x:e.x:e) y:e) x:e",
			"R:eet y:e x:e");
	}
	
	@Test
	public final void example1() {		
		reducesTo(
			"(\\A:et.\\B:et.\\x:e.AND:ttt (A:et x:e) (B:et x:e)) ate:et",
			"\\B:et.\\x:e.AND:ttt (ate:et x:e) (B:et x:e)");
	}
	
	@Test
	public final void example2() {
		reducesTo(
			"(\\f:ee.f:ee john:e) (\\x:e.x:e)",
			"john:e");
	}
	
	@Test
	public final void complex1() {
		reducesTo(
			"((\\x:e.\\f:et.f:et x:e) john:e) walks:et",
			"walks:et john:e");
	}
	
	@Test
	public final void identities1() {
		reducesTo(
			"(\\x:e.x:e) john:e",
			"john:e");
	}
	@Test
	public final void identities2() {
		reducesTo(
			"((\\A:et.A:et) walks:et) john:e",
			"walks:et john:e");
	}
	@Test
	public final void identities3() {
		reducesTo(
			"(((\\M:(et)et.M:(et)et) fast:(et)et) walks:et) john:e",
		    "(fast:(et)et walks:et) john:e");
	}
	
	@Test
	public final void irreducibles1() {
		reducesTo(
			"walks:et john:et",
		    "walks:et john:et");
	}
	@Test
	public final void irreducibles2() {
		reducesTo(
			"((fast:(et)et walks:et) john:e)",
		    "((fast:(et)et walks:et) john:e)");
	}
	@Test
	public final void irreducibles3() {
		reducesTo(
			"(((very:((et)et)(et)et fast:(et)et) walks:et) john:e)",
		    "(((very:((et)et)(et)et fast:(et)et) walks:et) john:e)");
	}

	private final void reducesTo(final String raw1, final String raw2) {
		val exp1 = stl.toDeBruijn(stl.parse(raw1));
		val exp2 = stl.toDeBruijn(stl.parse(raw2));
		val red1 = stl.format(stl.betaReduce(exp1));
		val red2 = stl.format(exp2);
		assertEquals(red2,red1);
	}
	
}
