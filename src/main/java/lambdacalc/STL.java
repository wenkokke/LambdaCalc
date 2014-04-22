package lambdacalc;

import static lambdacalc.Types.E;
import static lambdacalc.Types.EEET;
import static lambdacalc.Types.EET;
import static lambdacalc.Types.ET;
import static lambdacalc.Types.ET_ET;
import static lambdacalc.Types.ET_ET__ET_ET;
import static lambdacalc.Types.ET_T;
import static lambdacalc.Types.T;
import static lombok.AccessLevel.PRIVATE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import lambdacalc.impl.IDeBruijnIsClosed;
import lambdacalc.impl.IDeBruijnToClosedDomain;
import lambdacalc.impl.IDeBruijnToExpr;
import lambdacalc.impl.IDeBruijnToConstants;
import lambdacalc.impl.IDeBruijnToType;
import lambdacalc.impl.IDeBruijnBetaReducer;
import lambdacalc.impl.IDeBruijnBuilder;
import lambdacalc.impl.IDeBruijnEtaReducer;
import lambdacalc.impl.IDeBruijnPrinter;
import lambdacalc.impl.IDeBruijnRenamer;
import lambdacalc.impl.IDeBruijnTypeChecker;
import lambdacalc.impl.IExprToDeBruijn;
import lambdacalc.impl.IExprToFreeNames;
import lambdacalc.impl.IExprToType;
import lambdacalc.impl.IExprBetaReducer;
import lambdacalc.impl.IExprBuilder;
import lambdacalc.impl.IExprEtaReducer;
import lambdacalc.impl.IExprParser;
import lambdacalc.impl.IExprParserUntyped;
import lambdacalc.impl.IExprPrinter;
import lambdacalc.impl.IIndexPrinter;
import lambdacalc.impl.ISymbolPrinter;
import lambdacalc.impl.ITypeBuilder;
import lambdacalc.impl.ITypePrinter;
import lombok.Cleanup;
import lombok.Delegate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import com.google.common.collect.Maps;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class STL implements ExprParser, TypePrinter, SymbolPrinter,
		IndexPrinter, ExprPrinter, DeBruijnPrinter, DeBruijnRenamer,
		ExprToType, ExprToDeBruijn, ExprToFreeNames, DeBruijnToExpr,
		DeBruijnToConstants, DeBruijnTypeChecker, DeBruijnToType,
		DeBruijnEtaReducer, DeBruijnBetaReducer, ExprBetaReducer,
		ExprEtaReducer, DeBruijnToClosedDomain, DeBruijnIsClosed {
	
	// runs various lambda reductions from the command-line;
	public static final void main(String[] args) throws IOException, ParseException {
		val parser = new PosixParser();
		val options = new Options();
		options.addOption("u", "untyped", false, "Configures the lambda parser to consume untyped terms.");
		options.addOption("s", "simply-typed", false, "Configures the lambda parser to consume simply typed terms.");
		options.addOption("n", "normalize", false, "Applies normal-order reduction to the given lambda expression.");
		val cmds = parser.parse(options, args);
		val stl = new STL();
		
		@Cleanup
		val in = new BufferedReader(new InputStreamReader(System.in));
		val input = in.readLine();
		
		// parse the expression
		Expr expr;
		if (cmds.hasOption('s')) {
			expr = stl.parseExpr(input);
		}
		else {
			expr = stl.parseUntypedExpr(input);
		}
		
		// beta-reduce the expression
		if (cmds.hasOption('n')) {
			expr = stl.betaReduce(expr);
			expr = stl.etaReduce(expr);
		}
		
		// print the expression
		System.out.println(stl.format(expr));
	}

	// builder functions
	@Getter   TypeBuilder				typeBuilder			= new ITypeBuilder();
	@Getter   ExprBuilder				exprBuilder			= new IExprBuilder();
	@Getter   DeBruijnBuilder			deBruijnBuilder		= new IDeBruijnBuilder();
	
	// parsing functions
	@Delegate ExprParser				exprParser			= new IExprParser(typeBuilder,exprBuilder);
	@Delegate ExprParserUntyped			exprParserUntyped	= new IExprParserUntyped(exprBuilder);
	
	// naming conventions
	Map<Type,String> namingConventions = Maps.newHashMap();
	{
		namingConventions.put(T,"b");
		namingConventions.put(E,"x");
		namingConventions.put(ET,"A");
	    namingConventions.put(EET,"A");
	    namingConventions.put(EEET,"A");
	    namingConventions.put(ET_T,"P");
	    namingConventions.put(ET_ET,"M");
	    namingConventions.put(ET_ET__ET_ET,"M");
	}
	
	// printing functions
	@Delegate TypePrinter				typePrinter				= new ITypePrinter(); 
	@Delegate SymbolPrinter				symbolPrinter			= new ISymbolPrinter(typePrinter);
	@Delegate IndexPrinter				indexPrinter			= new IIndexPrinter(typePrinter);
	@Delegate DeBruijnPrinter   		deBruijnPrinter 		= new IDeBruijnPrinter(typePrinter,indexPrinter,symbolPrinter);
	@Delegate ExprPrinter				exprPrinter				= new IExprPrinter(symbolPrinter);
	
	// conversion functions
  	@Delegate DeBruijnToConstants		deBruijn2Constants		= new IDeBruijnToConstants();
	@Delegate DeBruijnToExpr			deBruijn2Expr			= new IDeBruijnToExpr(exprBuilder,namingConventions,deBruijn2Constants);
	@Delegate DeBruijnToType			deBruijn2Type			= new IDeBruijnToType(typeBuilder);
	@Delegate DeBruijnIsClosed      	deBruijnIsClosed    	= new IDeBruijnIsClosed();
	@Delegate DeBruijnToClosedDomain	deBruijnToClosedDomain  = new IDeBruijnToClosedDomain(deBruijn2Type, deBruijnBuilder, deBruijnIsClosed);
	@Delegate DeBruijnTypeChecker		deBruijnTypeChecker		= new IDeBruijnTypeChecker(typeBuilder,typePrinter,deBruijnPrinter);
	@Delegate ExprToFreeNames			expr2FreeNames			= new IExprToFreeNames();
	@Delegate ExprToDeBruijn			expr2DeBruijn			= new IExprToDeBruijn(deBruijnBuilder);
	@Delegate ExprToType				expr2Type				= new IExprToType(typeBuilder);
	
	// reduction functions
	@Delegate DeBruijnRenamer			deBruijnRenamer			= new IDeBruijnRenamer(deBruijnBuilder);
	@Delegate DeBruijnBetaReducer		deBruijnBetaReducer 	= new IDeBruijnBetaReducer(this,deBruijnBuilder,deBruijn2Type);
	@Delegate DeBruijnEtaReducer		deBruijnEtaReducer		= new IDeBruijnEtaReducer(deBruijnBuilder);
	@Delegate ExprBetaReducer			exprBetaReducer			= new IExprBetaReducer(expr2DeBruijn,deBruijnBetaReducer,deBruijn2Expr);
	@Delegate ExprEtaReducer			exprEtaReducer			= new IExprEtaReducer(expr2DeBruijn,deBruijnEtaReducer,deBruijn2Expr);
	
}
