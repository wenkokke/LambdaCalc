package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.DeBruijn;
import lambdacalc.Index;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

public abstract class IDeBruijn implements DeBruijn {

	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IAbstraction extends IDeBruijn {
		
		Type		type;
		DeBruijn	body;
		
		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.abstraction(type, body);
		}
	}
	
	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IApplication extends IDeBruijn {
		
		DeBruijn	fun, arg;
		
		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.application(fun, arg);
		}
	}
	
	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IVariable extends IDeBruijn {
		
		Index	i;

		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.variable(i);
		}
	}
	
	@ToString
	@RequiredArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	@FieldDefaults(makeFinal=true,level=PRIVATE)
	public static final class IConstant extends IDeBruijn {
		
		Symbol	s;

		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.constant(s);
		}
	}
}
