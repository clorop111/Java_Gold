package ex08;

import java.util.Optional;

public class FlatMap2 {
    
	public static void main(String[] args) {
		Optional<String> a = Optional.of("test");
		Optional<String> b = a.flatMap(str -> test(str));
		System.out.println(b.get());
	}
	
	private static Optional<String> test(String str) {
			return Optional.of(str.toUpperCase());
    }
}
