package ex23;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Sample {
    public static void main(String[] args) {
        int array[][] = {{1,2},{3,4},{5,6}};
        long count = Stream.of(array)
                    .flatMapToInt(IntStream::of)
                    .map(n -> n * 2)
                    .peek(System.out::println)
                    .filter(n -> (n % 3 == 0))
                    .count();
        System.out.println(" " + count);
    }
}
