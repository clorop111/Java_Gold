package ex09;

public class SampleResorce implements AutoCloseable {
  @Override
  public void close() throws Exception {
    System.out.println("sample");
    throw new RuntimeException("sample");
  }
}