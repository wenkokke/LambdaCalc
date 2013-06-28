package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnBuilder;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.impl.IDeBruijn.IAbstraction;
import lambdacalc.impl.IDeBruijn.IApplication;
import lambdacalc.impl.IDeBruijn.IConstant;
import lambdacalc.impl.IDeBruijn.IVariable;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class IDeBruijnBuilder implements DeBruijnBuilder {
	
	@Override
	public DeBruijn abstraction(Type arg0, DeBruijn arg1) {
		return new IAbstraction(arg0,arg1);
	}

	@Override
	public DeBruijn application(DeBruijn arg0, DeBruijn arg1) {
		return new IApplication(arg0,arg1);
	}

	@Override
	public DeBruijn variable(Index i) {
		return new IVariable(i);
	}

	@Override
	public DeBruijn constant(Symbol symbol) {
		return new IConstant(symbol);
	}

}
