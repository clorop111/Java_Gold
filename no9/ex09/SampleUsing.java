package ex09;

public class SampleUsing {
  public static void main(String[] args) {
    try (SampleResorce resorce = new SampleResorce();) {
      throw new Exception();
    } catch (Exception e) {
      for (Throwable t : e.getSuppressed()) {
        System.out.println(t);
      }
    } finally {
      System.out.println("finally");
    }
  }
}
