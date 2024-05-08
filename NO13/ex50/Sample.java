package ex50;

import java.util.stream.IntStream;

public class Sample {

    public static void main(String[] args) {
        IntStream stream = IntStream.iterate(0, a -> a + 1);
        stream.limit(5)
        .mapToObj(x -> x + ",")
        .forEach(System.out::println);
    }
}
