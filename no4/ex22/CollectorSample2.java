package ex22;

import java.util.Arrays;
import java.util.List;

public class CollectorSample2 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C","D","E");

    String result = list.parallelStream().collect(new SampleCollector());
    System.out.println(result);
  }
}
