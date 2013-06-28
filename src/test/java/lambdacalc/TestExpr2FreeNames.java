package lambdacalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;

public final class TestExpr2FreeNames extends TestLambdaCalc {
	
	@Test
	public final void somenames1() {
		withFreeNames(
		"(\\x:e.x:e) john:e",
		"john");
	}
	
	@Test
	public final void somenames2() {
		withFreeNames(
		"((\\A:et.A:et) walks:et) john:e",
		"walks","john");
	}
	
	@Test
	public final void somenames3() {
		withFreeNames(
		"(((\\M:(et)et.M:(et)et) fast:(et)et) walks:et) john:e",
		"fast","walks","john");
	}
	
	@Test
	public final void allnames1() {
		withFreeNames(
		"walks:et john:et",
		"walks","john");
	}
	@Test
	public final void allnames2() {
		withFreeNames(
		"((fast:(et)et walks:et) john:e)",
		"fast","walks","john");
	}
	@Test
	public final void allnames3() {
		withFreeNames(
		"(((very:((et)et)(et)et fast:(et)et) walks:et) john:e)",
		"very","fast","walks","john");
	}

	private final void withFreeNames(final String expr, final String... names) {
		assertEquals(ImmutableSet.copyOf(names),stl.freeNames(stl.parse(expr)));
	}
	
}
