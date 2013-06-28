package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.Symbol;
import lambdacalc.impl.IExpr.IAbstraction;
import lambdacalc.impl.IExpr.IApplication;
import lambdacalc.impl.IExpr.IVariable;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class IExprBuilder implements ExprBuilder {

	@Override
	public Expr abstraction(Symbol arg0, Expr arg1) {
		return new IAbstraction(arg0,arg1);
	}

	@Override
	public Expr application(Expr arg0, Expr arg1) {
		return new IApplication(arg0,arg1);
	}

	@Override
	public Expr variable(Symbol s) {
		return new IVariable(s);
	}
}