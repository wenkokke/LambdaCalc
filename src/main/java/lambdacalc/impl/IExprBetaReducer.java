package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijnToExpr;
import lambdacalc.DeBruijnBetaReducer;
import lambdacalc.Expr;
import lambdacalc.ExprToDeBruijn;
import lambdacalc.ExprBetaReducer;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprBetaReducer implements ExprBetaReducer {

	ExprToDeBruijn		expr2DeBruijn;
	DeBruijnBetaReducer	deBruijnBetaReducer;
	DeBruijnToExpr		deBruijn2Expr;
	
	
	@Override
	public final Expr betaReduce(final Expr expr) {
		return deBruijn2Expr.fromDeBruijn(
			deBruijnBetaReducer.betaReduce(
				expr2DeBruijn.toDeBruijn(expr)));
	}

}
