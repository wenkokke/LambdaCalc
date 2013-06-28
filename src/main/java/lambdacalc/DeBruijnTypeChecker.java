package lambdacalc;

public interface DeBruijnTypeChecker {
	
	Type checkType(DeBruijn expr) throws TypeError;

	boolean canApply(Type a, Type b);

	Type applyType(Type funType, Type argType) throws TypeError;
	
}
