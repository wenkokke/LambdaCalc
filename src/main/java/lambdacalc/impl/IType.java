package lambdacalc.impl;

import lambdacalc.Type;
import lombok.EqualsAndHashCode;
import lombok.experimental.Value;

public abstract class IType implements Type {
	
	@Value
	@EqualsAndHashCode(callSuper=false)
	public static final class IConstant extends IType {
		
		String	name;
		
		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.constant(name);
		}
	}
	
	@Value
	@EqualsAndHashCode(callSuper=false)
	public static final class IFunction extends IType {
		
		Type	fun;
		Type	arg;

		@Override
		public final <X> X accept(Visitor<X> v) {
			return v.function(fun, arg);
		}
	}
}
