package lambdacalc;

import static lombok.AccessLevel.PRIVATE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.Cleanup;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class LambdaRed {
	
	String LambdaRed;
	
	public final String reduce(String expr) throws IOException, InterruptedException {

		val command = String.format("%s \"%s\"", LambdaRed, expr);
		val builder = new ProcessBuilder(command);
		builder.redirectErrorStream(true);
		val ps = builder.start();
		
		@Cleanup
		val is = new BufferedReader(new InputStreamReader(ps.getInputStream()));
		
		String line;
		val output = new StringBuilder();
		while ((line = is.readLine()) != null) {
			if (!line.startsWith("Performed")) {
				output.append(line);
			}
		}
		return output.toString();
	}
	
}
