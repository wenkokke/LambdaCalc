package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;

import java.util.LinkedList;
import java.util.Map;

import com.google.common.collect.Lists;

import lambdacalc.DeBruijn;
import lambdacalc.DeBruijn2Expr;
import lambdacalc.DeBruijn2FreeNames;
import lambdacalc.Expr;
import lambdacalc.ExprBuilder;
import lambdacalc.FreshNameSupplier;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lambdacalc.DeBruijn.Visitor;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IDeBruijn2Expr implements DeBruijn2Expr {

	ExprBuilder			builder;
	Map<Type, String>	names;
	DeBruijn2FreeNames	freeNames;

	@Override
	public final Expr fromDeBruijn(final DeBruijn expr) {
		return expr.accept(new IConverter(
			new IFreshNameSupplier(names,freeNames.freeNames(expr))));
	}
	
	@RequiredArgsConstructor
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	private final class IConverter implements Visitor<Expr> {

		FreshNameSupplier supplier;
		LinkedList<Symbol> env = Lists.newLinkedList();
		
		@Override
		public final Expr abstraction(Type type, DeBruijn body) {
			val expr = builder.abstraction(fresh(type),body.accept(this));
			env.removeFirst();
			return expr;
		}

		@Override
		public final Expr application(DeBruijn fun, DeBruijn arg) {
			return builder.application(fun.accept(this), arg.accept(this)); 
		}

		@Override
		public final Expr variable(Index i) {
			return builder.variable(env.get(i.getIndex()));
		}

		@Override
		public final Expr constant(Symbol s) {
			return builder.variable(s);
		}
		
		// creates a fresh symbol and adds it to the env;
		private final Symbol fresh(final Type type) {
			val sym = supplier.fresh(type);
			env.addFirst(sym);
			return sym;
		}
	}
}
