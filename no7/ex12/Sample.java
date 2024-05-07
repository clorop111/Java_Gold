package ex12;

import java.util.Deque;
import java.util.ArrayDeque;

public class Sample {
  public static void main(String[] args) {
   
    Deque<String> deque = new ArrayDeque<>();
    deque.addLast("A");
    deque.addLast("B");
    deque.addFirst("C");
    deque.addFirst("D");

    deque.stream().forEach(System.out::println);
  }
}
