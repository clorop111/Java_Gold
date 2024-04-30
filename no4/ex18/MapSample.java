package ex18;

import java.util.Arrays;

public class MapSample {
  public static void main(String[] args) {
    String[] fruits = {"apple","orange","banana"};
    Arrays
          .stream(fruits)
          .map(f -> f.toUpperCase())
          .forEach(System.out::println);
  }
}
