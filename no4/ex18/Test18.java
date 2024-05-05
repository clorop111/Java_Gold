package ex18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test18 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//* innsert code here*/ 
		Stream<String> result = list.stream().map(n -> String.valueOf(n));
	}
}

// Stream<String> result
// Stream<Integer> result
// List<String> result
// List<String> result
