package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Type;
import lambdacalc.TypeBuilder;
import lambdacalc.Types;
import lambdacalc.impl.IType.IConstant;
import lambdacalc.impl.IType.IFunction;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class ITypeBuilder implements TypeBuilder {
	
	@Override
	public Type constant(String name) {
		if (name.equals("e")) {
			return Types.E;
		}
		else
		if (name.equals("t")) {
			return Types.T;
		}
		else {
			return new IConstant(name);
		}
	}
	
	@Override
	public Type function(Type arg0, Type arg1) {
		return new IFunction(arg0,arg1);
	}
}
