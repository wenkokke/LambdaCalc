package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.ExprParser;
import lambdacalc.ExprRichBuilder;
import lambdacalc.Type;
import lombok.Delegate;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class IExprRichBuilder implements ExprRichBuilder {
	
	@Delegate ExprBuilder builder;
	          ExprParser  parser;
		
	@Override
	public final Expr abstraction(String name, Type type, Expr body) {
		return abstraction(new ISymbol(name, type), body);
	}
	
	@Override
	public final Expr variable(String name, Type type) {
		return variable(new ISymbol(name, type));
	}
	
	@Override
	public final Expr parse(String rawExpr) {
		return parser.parse(rawExpr);
	}          
	
	@Override
	public final Expr application(final Expr... exprs) {
		if (exprs.length == 0) {
			throw new RuntimeException("Cannot construct empty application.");
		}
		else {
		
			Expr expr = exprs[0];
			for (int i = 1; i <= exprs.length; i++) {
				if (i == exprs.length) {
					return expr;
				}
				else {
					expr = builder.application(expr, exprs[i]);
				}
			}
			return expr;
			
		}
	}

}
