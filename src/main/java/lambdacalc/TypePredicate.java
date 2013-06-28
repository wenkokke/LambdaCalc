package lambdacalc;

import lambdacalc.Type.Visitor;


public abstract class TypePredicate implements Visitor<Boolean> {
		
	public static class True extends TypePredicate {
		@Override public Boolean constant(String name) { return true; }
		@Override public Boolean function(Type a, Type b) { return true; }
	}
	
	public static class False extends TypePredicate {
		@Override public Boolean constant(String name) { return false; }
		@Override public Boolean function(Type a, Type b) { return false; }
	}
	
	public static final TypePredicate IsConstant = new TypePredicate.False() {
		@Override public final Boolean constant(String name) { return true; }
	};
	
	public static final TypePredicate IsFunction = new TypePredicate.False() {
		@Override public final Boolean function(Type a, Type b) { return true; }
	};
}