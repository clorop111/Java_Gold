package ex08;

import java.util.Optional;

public class FlatMap {
    
	public static void main(String[] args) {
		Optional<String> a = Optional.of("test");
		Optional<Optional<String>> b = a.map(str -> test(str));
		System.out.println(b.get());
	}
	
	private static Optional<String> test(String str) {
			return Optional.of(str.toUpperCase());
    }
}
