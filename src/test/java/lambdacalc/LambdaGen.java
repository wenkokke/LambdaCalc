package lambdacalc;

import static lombok.AccessLevel.PRIVATE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.common.collect.ImmutableList;

import lombok.Cleanup;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class LambdaGen {
	
	String LambdaGen;
	
	public final List<String> generate(int seed, int size) throws IOException, InterruptedException {
		
		val ps = Runtime.getRuntime().exec(String.format("%s %d %d", LambdaGen, seed, size));
		
		@Cleanup
		val is = new BufferedReader(new InputStreamReader(ps.getInputStream()));
		
		String line;
		val lines = ImmutableList.<String> builder();
		while ((line = is.readLine()) != null) {
			lines.add(line);
		}
		return lines.build();
	}
	
}
