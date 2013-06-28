package lambdacalc.impl;

import static lambdacalc.TypePredicate.IsFunction;
import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Type;
import lambdacalc.TypePrinter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class ITypePrinter implements TypePrinter {
	
	@Override
	public final String format(Type type) {
		return type.accept(ITypePrinter);
	}
	
	// visitor to print types:
	static final Type.Visitor<String> ITypePrinter = new Type.Visitor<String>() {

		@Override
		public final String constant(String name) {
			return name;
		}

		@Override
		public final String function(Type a, Type b) {
			final StringBuilder builder = new StringBuilder();
			if (a.accept(IsFunction)) {
				builder.append('(').append(a.accept(this)).append(')');
			} else {
				builder.append(a.accept(this));
			}
			return builder.append(b.accept(this)).toString();
		}
	};

}
