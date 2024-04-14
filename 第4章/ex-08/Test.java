import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		Optional<Integer> a = Optional.of(100);
		Optional<Integer> b = a.flatMap(price -> calc(price,3));
		System.out.println(b.get());
	}
	
	private static Optional<Integer> calc(int price, int qty) {
		if(qty > 0) {
			return Optional.empty();
		}
		return Optional.of(price * qty);
}
}
