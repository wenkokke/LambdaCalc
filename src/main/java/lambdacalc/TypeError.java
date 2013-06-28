package lambdacalc;

public final class TypeError extends IllegalArgumentException {
	public TypeError(final String msg, final Object... args) {
		super(String.format(msg,args));
	}
}
