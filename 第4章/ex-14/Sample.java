import java.util.Arrays;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream()
			./* insert code here*/filter(n-> n > 5)
		.forEach(System.out::println);
	}
}

//filter(n-> n < 5)
//filter(n-> n > 5)
//map(n -. n > 5)
//map(n -. n < 5)