package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;
import lambdacalc.Symbol;
import lambdacalc.SymbolPrinter;
import lambdacalc.TypePrinter;
import lambdacalc.Types;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class ISymbolPrinter implements SymbolPrinter {

	TypePrinter typePrinter;
	
	@Override
	public final String format(Symbol symbol) {
		if (symbol.getType().equals(Types.STAR)) {
			return symbol.getName();
		}
		else {
			return symbol.getName() + ":" + typePrinter.format(symbol.getType());
		}
	}

}
