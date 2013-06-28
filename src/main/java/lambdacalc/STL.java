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

import java.util.Map;

import lambdacalc.impl.IDeBruijn2Expr;
import lambdacalc.impl.IDeBruijn2FreeNames;
import lambdacalc.impl.IDeBruijn2Type;
import lambdacalc.impl.IDeBruijnBetaReducer;
import lambdacalc.impl.IDeBruijnBuilder;
import lambdacalc.impl.IDeBruijnEtaReducer;
import lambdacalc.impl.IDeBruijnPrinter;
import lambdacalc.impl.IDeBruijnRenamer;
import lambdacalc.impl.IDeBruijnTypeChecker;
import lambdacalc.impl.IExpr2DeBruijn;
import lambdacalc.impl.IExpr2FreeNames;
import lambdacalc.impl.IExpr2Type;
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
		Expr2Type, Expr2DeBruijn, Expr2FreeNames, DeBruijn2Expr,
		DeBruijn2FreeNames, DeBruijnTypeChecker, DeBruijn2Type,
		DeBruijnEtaReducer, DeBruijnBetaReducer, ExprBetaReducer,
		ExprEtaReducer {
	
	// runs various lambda reductions from the command-line;
	public static final void main(String[] args) throws ParseException {
		val parser = new PosixParser();
		val options = new Options();
		options.addOption("u", "untyped", false, "Configures the lambda parser to consume untyped terms.");
		options.addOption("s", "simply-typed", false, "Configures the lambda parser to consume simply typed terms.");
		options.addOption("n", "normalize", false, "Applies normal-order reduction to the given lambda expression.");
		options.addOption("e", "expresison", true, "The lambda expression to work on.");
		val cmds = parser.parse(options, args);
		val stl = new STL();
		
		// run all commands
		val input = cmds.getOptionValue("e");
		
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
	@Getter   TypeBuilder			typeBuilder			= new ITypeBuilder();
	@Getter   ExprBuilder			exprBuilder			= new IExprBuilder();
	@Getter   DeBruijnBuilder		deBruijnBuilder		= new IDeBruijnBuilder();
	
	// parsing functions
	@Delegate ExprParser			exprParser			= new IExprParser(typeBuilder,exprBuilder);
	@Delegate ExprParserUntyped		exprParserUntyped	= new IExprParserUntyped(exprBuilder);
	
	// naming conventions
	          Map<Type,String>      namingConventions   = Maps.newHashMap();
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
	@Delegate TypePrinter			typePrinter			= new ITypePrinter(); 
	@Delegate SymbolPrinter			symbolPrinter		= new ISymbolPrinter(typePrinter);
	@Delegate IndexPrinter			indexPrinter		= new IIndexPrinter(typePrinter);
	@Delegate ExprPrinter			exprPrinter			= new IExprPrinter(symbolPrinter);
	@Delegate DeBruijnPrinter   	deBruijnPrinter 	= new IDeBruijnPrinter(typePrinter,indexPrinter,symbolPrinter);
	
	// conversion functions
  	@Delegate Expr2FreeNames		expr2FreeNames		= new IExpr2FreeNames();
	@Delegate Expr2DeBruijn			expr2DeBruijn		= new IExpr2DeBruijn(deBruijnBuilder);
	@Delegate Expr2Type				expr2Type			= new IExpr2Type(typeBuilder);
	@Delegate DeBruijn2FreeNames	deBruijn2FreeNames	= new IDeBruijn2FreeNames();
	@Delegate DeBruijn2Expr			deBruijn2Expr		= new IDeBruijn2Expr(exprBuilder,namingConventions,deBruijn2FreeNames);
	@Delegate DeBruijn2Type			deBruijn2Type		= new IDeBruijn2Type(typeBuilder);
	@Delegate DeBruijnTypeChecker	deBruijnTypeChecker	= new IDeBruijnTypeChecker(typeBuilder,typePrinter,deBruijnPrinter);
	
	// reduction functions
	@Delegate DeBruijnRenamer		deBruijnRenamer		= new IDeBruijnRenamer(deBruijnBuilder);
	@Delegate DeBruijnBetaReducer	deBruijnBetaReducer = new IDeBruijnBetaReducer(this,deBruijnBuilder,deBruijn2Type);
	@Delegate DeBruijnEtaReducer	deBruijnEtaReducer	= new IDeBruijnEtaReducer(deBruijnBuilder);
	@Delegate ExprBetaReducer		exprBetaReducer		= new IExprBetaReducer(expr2DeBruijn,deBruijnBetaReducer,deBruijn2Expr);
	@Delegate ExprEtaReducer		exprEtaReducer		= new IExprEtaReducer(expr2DeBruijn,deBruijnEtaReducer,deBruijn2Expr);
	
}
