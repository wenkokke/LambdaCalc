package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.impl.IExpr.IAbstraction;
import lambdacalc.impl.IExpr.IApplication;
import lambdacalc.impl.IExpr.IVariable;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class IExprBuilder implements ExprBuilder {

	@Override
	public final Expr abstraction(Symbol arg0, Expr arg1) {
		return new IAbstraction(arg0,arg1);
	}
	
	public final Expr abstraction(String name, Type type, Expr body) {
		return new IAbstraction(new ISymbol(name, type), body);
	}

	@Override
	public final Expr application(Expr arg0, Expr arg1) {
		return new IApplication(arg0,arg1);
	}

	@Override
	public final Expr variable(Symbol s) {
		return new IVariable(s);
	}
	
	public final Expr variable(String name, Type type) {
		return new IVariable(new ISymbol(name, type));
	}
}