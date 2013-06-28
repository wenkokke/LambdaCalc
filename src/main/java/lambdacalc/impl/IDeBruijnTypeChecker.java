package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;

import java.util.LinkedList;

import com.google.common.collect.Lists;

import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnPrinter;
import lambdacalc.DeBruijnTypeChecker;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.TypeBuilder;
import lambdacalc.TypeError;
import lambdacalc.DeBruijn.Visitor;
import lambdacalc.TypePrinter;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Value;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IDeBruijnTypeChecker implements DeBruijnTypeChecker {

	TypeBuilder		typeBuilder;
	TypePrinter		typePrinter;
	DeBruijnPrinter	deBruijnPrinter;
	
	@Override
	public final Type checkType(final DeBruijn expr) throws TypeError {
		return expr.accept(new ITypeChecker());
	}
	
	@Override
	public final boolean canApply(final Type funType, final Type argType) {
		try {
			applyType(funType,argType);
			return true;
		}
		catch (TypeError e) {
			return false;
		}
	}
	
	@Override
	public final Type applyType(final Type funType, final Type argType) throws TypeError {
		return funType.accept(new TypeBuilder() {
			@Override
			public final Type constant(String _) {
				throw new TypeError(
					"cannot apply function of type '%s' to argument of type '%s'",
					typePrinter.format(funType),
					typePrinter.format(argType));
			}
			@Override
			public final Type function(Type a, Type b) {
				if (argType.equals(a)) {
					return b;
				}
				else {
					throw new TypeError("cannot apply function of type '%s' to argument of type '%s'",
							typePrinter.format(funType),
							typePrinter.format(argType));
				}
			}
		});
	}
	
	@Value
	private final class ITypeChecker implements Visitor<Type> {
		
		LinkedList<Type> env = Lists.newLinkedList();

		@Override
		public final Type abstraction(final Type argType, final DeBruijn body) {
			env.addFirst(argType);
			val bodyType = body.accept(this);
			env.removeFirst();
			return typeBuilder.function(argType, bodyType);
		}

		@Override
		public final Type application(final DeBruijn fun, final DeBruijn arg) {
			val argType = arg.accept(this);
			val funType = fun.accept(this);
			try {
				return applyType(funType,argType);
			}
			catch (TypeError e) {
				throw new TypeError("cannot apply function '%s' of type '%s' to expression '%s' of type '%s'",
					deBruijnPrinter.format(fun),	
					typePrinter.format(funType),
					deBruijnPrinter.format(arg),
					typePrinter.format(argType));
			}
		}

		@Override
		public final Type variable(final Index i) {
			return i.getType();
		}

		@Override
		public final Type constant(final Symbol s) {
			return s.getType();
		}

	}

}
