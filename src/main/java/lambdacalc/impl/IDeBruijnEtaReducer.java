package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnBuilder;
import lambdacalc.DeBruijnEtaReducer;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IDeBruijnEtaReducer implements DeBruijnBuilder, DeBruijnEtaReducer {
	
	DeBruijnBuilder builder;
	
	@Override
	public final DeBruijn etaReduce(final DeBruijn expr) {
		return expr.accept(this);
	}

	@Override // match an abstraction \\x.body
	public final DeBruijn abstraction(final Type type, final DeBruijn body) {
		return body.accept(new DeBruijnBuilder() {
			
			@Override // match an application \\x.f y
			public final DeBruijn application(final DeBruijn fun, final DeBruijn arg) {
				return arg.accept(new DeBruijnBuilder() {
					
					@Override // match a variable \\x.f x if (x == y)
					public final DeBruijn variable(final Index i) {
						if (i.getIndex().equals(0)) {
							return etaReduce(fun);
						}
						else {
							return builder.abstraction(type, etaReduce(body));
						}
					}
					
					// otherwise
					
					@Override // recurse, reconstruct the abstraction
					public final DeBruijn abstraction(final Type _1, final DeBruijn _2) {
						return builder.abstraction(type, etaReduce(body));
					}
					@Override // recurse, reconstruct the abstraction
					public final DeBruijn application(final DeBruijn _1, final DeBruijn _2) {
						return builder.abstraction(type, etaReduce(body));
					}
					@Override // reconstruct the abstraction, don't recurse
					public final DeBruijn constant(final Symbol _) {
						return builder.abstraction(type, body);
					}
				});
			}
			
			// otherwise
			
			@Override // recurse, reconstruct the abstraction
			public DeBruijn abstraction(final Type _1, final DeBruijn _2) {
				return builder.abstraction(type, etaReduce(body));
			}
			@Override // reconstruct the abstraction, don't recurse
			public DeBruijn variable(final Index _) {
				return builder.abstraction(type, body);
			}
			@Override // reconstruct the abstraction, don't recurse
			public DeBruijn constant(final Symbol _) {
				return builder.abstraction(type, body);
			}
		});
	}
	
	// otherwise

	@Override // recurse, reconstruct the application
	public final DeBruijn application(DeBruijn fun, DeBruijn arg) {
		return builder.application(etaReduce(fun), etaReduce(arg));
	}
	@Override // reconstruct the variable, don't recurse
	public final DeBruijn variable(final Index i) {
		return builder.variable(i);
	}
	@Override // reconstruct the constant, don't recurse
	public final DeBruijn constant(final Symbol s) {
		return builder.constant(s);
	}
}
