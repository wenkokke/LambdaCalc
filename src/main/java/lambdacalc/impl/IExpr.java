package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Expr;
import lambdacalc.Symbol;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

public abstract class IExpr implements Expr {

	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IAbstraction extends IExpr {
		
		Symbol	symbol;
		Expr	arg;
		
		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.abstraction(symbol, arg);
		}
	}
	
	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IApplication extends IExpr {
		
		Expr	fun;
		Expr	arg;
		
		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.application(fun, arg);
		}
	}
	
	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IVariable extends IExpr {
		
		Symbol	s;

		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.variable(s);
		}
	}
}
