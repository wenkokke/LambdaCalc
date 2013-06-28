package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnBuilder;
import lambdacalc.DeBruijnRenamer;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Value;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IDeBruijnRenamer implements DeBruijnRenamer {

	DeBruijnBuilder builder;
	
	@Override
	public final DeBruijn rename(String from, String to, DeBruijn subject) {
		return subject.accept(new IRenameFree(from,to));
	}
	
	@Value
	private final class IRenameFree implements DeBruijnBuilder {
		
		String from,to;
		
		@Override
		public final DeBruijn abstraction(Type type, DeBruijn body) {
			return builder.abstraction(type, body.accept(this));
		}

		@Override
		public final DeBruijn application(DeBruijn fun, DeBruijn arg) {
			return builder.application(fun.accept(this), arg.accept(this));
		}

		@Override
		public final DeBruijn variable(Index i) {
			return builder.variable(i);
		}

		@Override
		public final DeBruijn constant(Symbol s) {
			if (s.getName().equals(from)) {
				return builder.constant(new ISymbol(to,s.getType()));
			}
			else {
				return builder.constant(s);
			}
		}
		
	}
}
