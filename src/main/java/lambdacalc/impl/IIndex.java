package lambdacalc.impl;

import lambdacalc.Index;
import lambdacalc.Type;
import lombok.EqualsAndHashCode;
import lombok.experimental.Value;

@Value
@EqualsAndHashCode(callSuper=false)
public final class IIndex implements Index {
	
	Integer	index;
	Type	type;
	
}
