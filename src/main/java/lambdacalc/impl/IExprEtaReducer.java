package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijnToExpr;
import lambdacalc.DeBruijnEtaReducer;
import lambdacalc.Expr;
import lambdacalc.ExprToDeBruijn;
import lambdacalc.ExprEtaReducer;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprEtaReducer implements ExprEtaReducer {

	ExprToDeBruijn		expr2DeBruijn;
	DeBruijnEtaReducer	deBruijnEtaReducer;
	DeBruijnToExpr		deBruijn2Expr;
	
	
	@Override
	public final Expr etaReduce(final Expr expr) {
		return deBruijn2Expr.fromDeBruijn(
			deBruijnEtaReducer.etaReduce(
				expr2DeBruijn.toDeBruijn(expr)));
	}

}
