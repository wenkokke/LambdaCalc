package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestBetaReducer$RTE1dev119 extends ATestLambdaCalc {

	@Test
	public final void fromStep1() {
		reduce("(\\A0.\\A1.EXISTS (\\x0.AND (A0 x0) (A1 x0))) ((\\A2.\\A3.\\x1.AND (A3 x1) (A2 x1)) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused)) ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) american)) pleads_innocent");
	}

	@Test
	public final void fromStep2() {
		reduce("(\\A1.EXISTS (\\x0.AND ((\\A2.\\A3.\\x1.AND (A3 x1) (A2 x1)) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused)) ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) american) x0) (A1 x0))) (pleads_innocent)");
	}

	@Test
	public final void fromStep3() {
		reduce("EXISTS (\\x0.AND ((\\A2.\\A3.\\x1.AND (A3 x1) (A2 x1)) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused)) ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) american) x0) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep4() {
		reduce("EXISTS (\\x0.AND ((\\A3.\\x1.AND (A3 x1) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused) x1)) ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) american) x0) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep5() {
		reduce("EXISTS (\\x0.AND ((\\x1.AND ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) american x1) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused) x1)) (x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep6() {
		reduce("EXISTS (\\x0.AND (AND ((\\A7.\\x5.AND (A7 x5) (cuban A7 x5)) (american) x0) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused) x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep7() {
		reduce("EXISTS (\\x0.AND (AND ((\\x5.AND (american x5) (cuban american x5)) (x0)) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused) x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep8() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) ((\\A4.\\x2.A4 x2) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused) x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep9() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) ((\\x2.(\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused x2) (x0))) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep10() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) ((\\P0.\\A5.\\x3.AND (A5 x3) (P0 (\\x4.of x3 A5 x4))) (\\A6.A6 espionage) accused x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep11() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) ((\\A5.\\x3.AND (A5 x3) ((\\A6.A6 espionage) (\\x4.of x3 A5 x4))) (accused) x0)) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep12() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) ((\\x3.AND (accused x3) ((\\A6.A6 espionage) (\\x4.of x3 accused x4))) (x0))) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep13() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) (AND (accused x0) ((\\A6.A6 espionage) (\\x4.of x0 accused x4)))) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep14() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) (AND (accused x0) ((\\x4.of x0 accused x4) (espionage)))) (pleads_innocent x0))");
	}

	@Test
	public final void fromStep15() {
		reduce("EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) (AND (accused x0) (of x0 accused espionage))) (pleads_innocent x0))");
	}

	private final void reduce(final String raw) {
		reducesTo(raw,"EXISTS (\\x0.AND (AND (AND (american x0) (cuban american x0)) (AND (accused x0) (of x0 accused espionage))) (pleads_innocent x0))");
	}

	private final void reducesTo(final String raw1, final String raw2) {
		val exp2 = stl.format(stl.fromDeBruijn(stl.toDeBruijn(stl.parseUntypedExpr(raw2))));
		val exp1 = stl.format(stl.fromDeBruijn(stl.betaReduce(stl.toDeBruijn(stl.parseUntypedExpr(raw1)))));
		assertEquals(exp2, exp1);
	}

}
