package ex11;

public interface A {
  default void test() {
    System.out.println("A");
  }
}
