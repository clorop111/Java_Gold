package ex22;

import java.util.Arrays;
import java.util.List;

public class CollectorSample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C","D","E");

    String result = list.stream().collect(new SampleCollector());
    System.out.println(result);
  }
}
