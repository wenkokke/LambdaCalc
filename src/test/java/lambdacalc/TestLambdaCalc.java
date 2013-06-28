package lambdacalc;

import lambdacalc.STL;

import org.junit.Before;

public abstract class TestLambdaCalc {

	protected STL stl;
	
	@Before
	public final void setUp() {
		stl = new STL();
	}

}
