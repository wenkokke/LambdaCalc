package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn2Expr;
import lambdacalc.DeBruijnEtaReducer;
import lambdacalc.Expr;
import lambdacalc.Expr2DeBruijn;
import lambdacalc.ExprEtaReducer;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExprEtaReducer implements ExprEtaReducer {

	Expr2DeBruijn		expr2DeBruijn;
	DeBruijnEtaReducer	deBruijnEtaReducer;
	DeBruijn2Expr		deBruijn2Expr;
	
	
	@Override
	public final Expr etaReduce(final Expr expr) {
		return deBruijn2Expr.fromDeBruijn(
			deBruijnEtaReducer.etaReduce(
				expr2DeBruijn.toDeBruijn(expr)));
	}

}
