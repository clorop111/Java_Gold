package amp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Shose> sList = Arrays.asList(
            new Shose("Blue"),
            new Shose("Red"),
            new Shose("Green")
        );



        Stream<Shose> ss = sList.stream();

        ss.map(s -> s.getColor())
        .forEach(System.out::println);


        // long count = ss.map(s -> s.getColor().subSequence(0,1))
        // .peek(s -> System.out.println("debug! [" + s + "]"))
        // .count();
        // System.out.println(count);
  
    }
}
