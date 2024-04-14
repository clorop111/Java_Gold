import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main20 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("B","A","D","C");
		Optional<String> result =
			list.stream().max((a, b) -> a.compareTo(b));
		result.ifPresent(System.out::println);
	}
}

// A,と表示される
// Cと表示される
// Dと表示される
// コンパイルエラー
// 実行時に例外がスローされる