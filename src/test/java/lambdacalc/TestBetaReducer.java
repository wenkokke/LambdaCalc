package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;

public abstract class TestBetaReducer extends TestLambdaCalc {

	protected final void reducesTo(final String str1, final String str2) {
	    val exp1 = stl.toDeBruijn(stl.parseUntypedExpr(str1));
	    val exp2 = stl.toDeBruijn(stl.parseUntypedExpr(str2));
	    val red1 = stl.format(stl.fromDeBruijn(stl.betaReduce(exp1)));
	    val red2 = stl.format(stl.fromDeBruijn(exp2));
	    assertEquals(red2,red1);
	  }

}