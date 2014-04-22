package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnBuilder;
import lambdacalc.DeBruijnRichBuilder;
import lambdacalc.ExprParser;
import lambdacalc.ExprToDeBruijn;
import lambdacalc.Type;
import lombok.Delegate;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public class IDeBruijnRichBuilder implements DeBruijnRichBuilder {
	
	@Delegate DeBruijnBuilder builder;
	          ExprParser      parser;
	          ExprToDeBruijn  converter;
	          
	@Override
	public final DeBruijn parse(String rawExpr) {
		return converter.toDeBruijn(parser.parseExpr(rawExpr));
	}
	
	@Override
	public final DeBruijn variable(Integer index, Type type) {
		return builder.variable(new IIndex(index, type));
	}

	@Override
	public final DeBruijn constant(String name, Type type) {
		return builder.constant(new ISymbol(name, type));
	}

	@Override
	public final DeBruijn application(final DeBruijn... exprs) {
		if (exprs.length == 0) {
			throw new RuntimeException("Cannot construct empty application.");
		}
		else {
		
			DeBruijn expr = exprs[0];
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

	@Override
	public DeBruijn abstraction(DeBruijn expr, final Type... types) {
		
		for (int i = types.length; i >= -1; i--) {
			if (i == types.length) {
				return expr;
			}
			else {
				expr = builder.abstraction(types[i], expr);
			}
		}
		return expr;
		
	}

}
