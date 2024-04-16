import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		Optional<String> sample = Optional.of("test");
		sample.ifPresent((str) -> System.out.println(str));
	}
}