package lambdacalc.impl;

import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.EqualsAndHashCode;
import lombok.experimental.Value;

@Value
@EqualsAndHashCode(callSuper=false)
public final class ISymbol implements Symbol {
	
	String	name;
	Type	type;
	
}
