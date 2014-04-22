package lambdacalc;

import lombok.val;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import static org.junit.Assert.*;

public class TestClosedDomain extends ATestLambdaCalc {
	
	
	@Test
	public void testIsClosed1() {
		val expr = stl.parseExpr("\\x:e.IMPLIES:ttt (dog:et x:e) (ran:et x:e)");
		val debr = stl.toDeBruijn(expr);
		assertTrue("Expected `isClosed` to be true for " + stl.format(expr), stl.isClosed(debr));
	}
	
	@Test
	public void testExample1() {
		val exp1 = stl.parseExpr("dog:et");
		val exp2 = stl.parseExpr("ran:et");
		val exp3 = stl.parseExpr("\\x:e.IMPLIES:ttt (dog:et x:e) (ran:et x:e)");
		
		val deb1 = stl.toDeBruijn(exp1);
		val deb2 = stl.toDeBruijn(exp2);
		val deb3 = stl.toDeBruijn(exp3);
		
		val expd = Lists.newArrayList(deb1, deb2, deb3);
		val actl = stl.domainOf(Types.ET, deb3);
		
		for (val pred : actl) {
			assertTrue("Function `toClosedDomain` generated invalid expression "
						+ stl.format(stl.fromDeBruijn(pred)), expd.contains(pred));
			expd.remove(pred);
		}
		
		assertTrue("Function `toClosedDomain` didn't generated expected expressions "
				 	+ Iterables.toString(Lists.transform(expd, new Function<DeBruijn,String>() {
						@Override public final String apply(final DeBruijn arg0) {
							return stl.format(arg0);
						}
				 	})), expd.isEmpty());
	}

}
