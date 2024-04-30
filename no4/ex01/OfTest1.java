package ex01;

import java.util.Optional;

public class OfTest1 {
	public static void main(String[] args) {
		Optional<String> sample = Optional.of(null);
		System.out.println(sample);
	}
}