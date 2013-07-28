package lambdacalc;

import lambdacalc.STL;

import org.junit.Before;

public abstract class ATestLambdaCalc {

	protected STL stl;
	
	@Before
	public final void setUp() {
		stl = new STL();
	}

}
