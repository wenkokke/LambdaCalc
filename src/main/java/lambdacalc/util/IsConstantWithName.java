package lambdacalc.util;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.google.common.base.Predicate;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public final class IsConstantWithName implements Predicate<DeBruijn>, DeBruijn.Visitor<Boolean> {

	String name;

	@Override
	public final boolean apply(DeBruijn arg0) {
		return arg0.accept(this);
	}

	@Override
	public final Boolean constant(Symbol arg0) {
		if (arg0.getName().equals(name)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public final Boolean abstraction(Type arg0, DeBruijn arg1) {
		return false;
	}

	@Override
	public final Boolean application(DeBruijn arg0, DeBruijn arg1) {
		return false;
	}

	@Override
	public final Boolean variable(Index arg0) {
		return false;
	}
}
