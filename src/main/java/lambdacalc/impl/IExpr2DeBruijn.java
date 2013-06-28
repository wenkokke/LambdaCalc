package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;

import java.util.LinkedList;

import lambdacalc.DeBruijn;
import lambdacalc.DeBruijnBuilder;
import lambdacalc.Expr;
import lambdacalc.Expr2DeBruijn;
import lambdacalc.Symbol;
import lambdacalc.Expr.Visitor;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

import com.google.common.collect.Lists;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IExpr2DeBruijn implements Visitor<DeBruijn>, Expr2DeBruijn {
	
	@Override
	public final DeBruijn toDeBruijn(Expr expr) {
		return expr.accept(this);
	}
	
	DeBruijnBuilder builder;
	LinkedList<Symbol> env	= Lists.newLinkedList();

	@Override
	public final DeBruijn abstraction(Symbol sym, Expr arg) {
		env.addFirst(sym);
		val arg$db = arg.accept(this);
		env.removeFirst();
		return builder.abstraction(sym.getType(),arg$db);
	}

	@Override
	public final DeBruijn application(Expr fun, Expr arg) {
		val fun$db = fun.accept(this);
		val arg$db = arg.accept(this);
		return builder.application(fun$db, arg$db);
	}

	@Override
	public final DeBruijn variable(Symbol sym) {
		if (env.contains(sym)) {
			return builder.variable(new IIndex(env.indexOf(sym),sym.getType()));
		}
		else {
			return builder.constant(sym);
		}
	}

}
