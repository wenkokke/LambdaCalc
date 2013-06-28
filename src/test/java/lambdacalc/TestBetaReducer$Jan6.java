package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

import org.junit.Test;

public final class TestBetaReducer$Jan6 extends TestLambdaCalc {

	@Test
	public final void fromStep1() {
		reduce("(\\A0:et.\\P0:(et)t.\\A1:et.AND:ttt (P0:(et)t A1:et) (P0:(et)t A0:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))) ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)))");
	}

	@Test
	public final void fromStep2() {
		reduce("(\\P0:(et)t.\\A1:et.AND:ttt (P0:(et)t A1:et) (P0:(et)t ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))) ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)))");
	}

	@Test
	public final void fromStep3() {
		reduce("(\\A1:et.AND:ttt ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) A1:et) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))) ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)))");
	}

	@Test
	public final void fromStep4() {
		reduce("AND:ttt ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep5() {
		reduce("AND:ttt ((\\A4:et.A4:et (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep6() {
		reduce("AND:ttt ((\\M0:(et)et.\\x4:e.M0:(et)et (\\x5:e.T:t) x4:e) (\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep7() {
		reduce("AND:ttt ((\\x4:e.(\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)) (\\x5:e.T:t) x4:e) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep8() {
		reduce("AND:ttt ((\\A7:et.\\x6:e.AND:ttt (A7:et x6:e) (popular:(et)et A7:et x6:e)) (\\x5:e.T:t) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep9() {
		reduce("AND:ttt ((\\x6:e.AND:ttt ((\\x5:e.T:t) x6:e) (popular:(et)et (\\x5:e.T:t) x6:e)) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep10() {
		reduce("AND:ttt (AND:ttt ((\\x5:e.T:t) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep11() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep12() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) (search_engine:et) x2:e) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et) x2:e))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep13() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt ((\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) (x2:e)) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et) x2:e))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep14() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) (search_engine:et)) x2:e))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep15() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\A3:et.\\A4:et.A4:et (IOTA:(et)e A3:et)) ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep16() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\A4:et.A4:et (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e)))");
	}

	@Test
	public final void fromStep17() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\P1:(et)t.\\x0:e.P1:(et)t (\\x1:e.EQ:eet x1:e x0:e)) (\\A2:et.A2:et google:e) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))))");
	}

	@Test
	public final void fromStep18() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\x0:e.(\\A2:et.A2:et google:e) (\\x1:e.EQ:eet x1:e x0:e)) (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))))");
	}

	@Test
	public final void fromStep19() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\A2:et.A2:et google:e) (\\x1:e.EQ:eet x1:e (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))))");
	}

	@Test
	public final void fromStep20() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) ((\\x1:e.EQ:eet x1:e (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et)))) (google:e))");
	}

	@Test
	public final void fromStep21() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e ((\\A5:et.\\x2:e.AND:ttt (A5:et x2:e) (largest:(et)et A5:et x2:e)) ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et))))");
	}

	@Test
	public final void fromStep22() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e (\\x2:e.AND:ttt ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) (search_engine:et) x2:e) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et) x2:e))))");
	}

	@Test
	public final void fromStep23() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e (\\x2:e.AND:ttt ((\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) (x2:e)) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) search_engine:et) x2:e))))");
	}

	@Test
	public final void fromStep24() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et ((\\A6:et.\\x3:e.AND:ttt (A6:et x3:e) (on_the_web:et x3:e)) (search_engine:et)) x2:e))))");
	}

	@Test
	public final void fromStep25() {
		reduce("AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))");
	}

	private final void reduce(final String raw) {
		reducesTo(raw,"AND:ttt (AND:ttt (T:t) (popular:(et)et (\\x5:e.T:t) (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))) (EQ:eet google:e (IOTA:(et)e (\\x2:e.AND:ttt (AND:ttt (search_engine:et x2:e) (on_the_web:et x2:e)) (largest:(et)et (\\x3:e.AND:ttt (search_engine:et x3:e) (on_the_web:et x3:e)) x2:e))))");
	}

	private final void reducesTo(final String raw1, final String raw2) {
		val exp1 = stl.format(stl.fromDeBruijn(stl.betaReduce(stl.toDeBruijn(stl.parse(raw1)))));
		val exp2 = stl.format(stl.fromDeBruijn(stl.toDeBruijn(stl.parse(raw2))));
		assertEquals(exp2, exp1);
	}

}
