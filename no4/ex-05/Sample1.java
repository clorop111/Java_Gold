import java.util.Optional;

public class Sample1 {
	public static void main(String[] args) {
		Optional<String> sample = Optional.empty();
		sample.ifPresent((str) -> System.out.println(str));
	}
}