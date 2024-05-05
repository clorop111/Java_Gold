package ex07;

public class Sample {
  public static void main(String[] args) {
    Test<?> test = new Test<>("null");
    String msg = (String) test.getValue();
    //test.setValue("sample");
    //test.setValue(new Object());
    test.setValue(null);
  }
}
