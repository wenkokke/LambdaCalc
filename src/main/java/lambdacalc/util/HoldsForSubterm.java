package lambdacalc.util;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.google.common.base.Predicate;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public final class HoldsForSubterm implements DeBruijn.Visitor<Boolean> {
		
	@NonNull
	Predicate<DeBruijn> pred;
	
	@Override
	public final Boolean abstraction(Type arg0, DeBruijn arg1) {
		return pred.apply(arg1) || arg1.accept(this);
	}

	@Override
	public final Boolean application(DeBruijn arg0, DeBruijn arg1) {
		return pred.apply(arg0)
		    || pred.apply(arg1)
		    || arg0.accept(this)
		    || arg1.accept(this);
	}

	@Override
	public final Boolean constant(Symbol arg0) {
		return false;
	}

	@Override
	public final Boolean variable(Index arg0) {
		return false;
	}
}
