package lambdacalc;

import java.io.IOException;

import lombok.val;

public final class Main {

	public final static void main(String[] args) throws IOException, InterruptedException {
		val gen = new LambdaGen("target/LambdaGen.exe");
		val red = new LambdaRed("target/LambdaRed.exe");
		
		for (val exp: gen.generate(0, 25)) {
			System.out.println(exp + " ==> " + red.reduce(exp));
			break;
		}
	}

}
