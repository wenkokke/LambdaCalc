package lambdacalc;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;
import lambdacalc.impl.IType.IConstant;
import lambdacalc.impl.IType.IFunction;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor(access=PRIVATE)
@FieldDefaults(makeFinal=true,level=PUBLIC)
public final class Types {

	static Type STAR			= new IConstant("*");
	static Type	T				= new IConstant("t");
	static Type TT				= new IFunction(T, T);
	static Type TTT				= new IFunction(T, TT);
	static Type	E				= new IConstant("e");
	static Type	ET				= new IFunction(E, T);
	static Type	EET				= new IFunction(E, ET);
	static Type	EEET			= new IFunction(E, EET);
	static Type	ET_T			= new IFunction(ET, T);
	static Type ET_E			= new IFunction(ET, E);
	static Type	ET_ET			= new IFunction(ET, ET);
	static Type	ET_ET__ET_ET	= new IFunction(ET_ET, ET_ET);
	
//	public static final Type of(String type) {
//		switch (type) {
//		case "t"				: return T;
//		case "tt"				: return TT;
//		case "ttt"				: return TTT;
//		case "e"				: return E;
//		case "et"				: return ET;
//		case "eet"				: return EET;
//		case "eeet" 			: return EEET;
//		case "(et)t"			: return ET_T;
//		case "(et)e"			: return ET_E;
//		case "(et)et"			: return ET_ET;
//		case "((et)et)(et)et" 	: return ET_ET__ET_ET;
//		default:
//			return (new IExprParser()).parseType(type);
//		}
//	}
	
}
