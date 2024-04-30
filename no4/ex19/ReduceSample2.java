package ex19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSample2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    Optional<Integer> result =
          list.stream().reduce((a, b) -> {
          int c = a + b;
          System.out.print("a = " + a);
          System.out.print(",b = " + b);
          System.out.println(", a + b = " + c);
          return c;
          });
        result.ifPresent(System.out::println);
   }
}