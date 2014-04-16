package lambdacalc.impl;

import lambdacalc.Index;
import lambdacalc.Type;
import lombok.EqualsAndHashCode;
import lombok.experimental.Value;
import lombok.experimental.Wither;

@Value
@EqualsAndHashCode(callSuper=false)
public final class IIndex implements Index {
	
	@Wither
	Integer	index;
	Type	type;
	
}
