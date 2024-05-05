package ex28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
        stream.forEach(System.out::println);
    }
}
