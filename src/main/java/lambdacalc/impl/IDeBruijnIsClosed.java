package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnIsClosed;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IDeBruijnIsClosed implements DeBruijnIsClosed {

	@Override
	public final boolean isClosed(DeBruijn e) {
		return e.accept(new IDeBruijnIsClosedVisitor(0));
	}
	
	@RequiredArgsConstructor
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	private final class IDeBruijnIsClosedVisitor implements DeBruijn.Visitor<Boolean> {
		
		int depth;

		@Override
		public final Boolean abstraction(Type _, DeBruijn body) {
			return body.accept(new IDeBruijnIsClosedVisitor(depth + 1));
		}

		@Override
		public final Boolean application(DeBruijn fun, DeBruijn arg) {
			return fun.accept(this) && arg.accept(this);
		}

		@Override
		public final Boolean variable(Index i) {
			return depth > i.getIndex();
		}

		@Override
		public final Boolean constant(Symbol s) {
			return true;
		}
		
	}
	
}
