package ex06;

public class Sample {
  private String message;
  public Test test(String value) {
    class A implements Test{
    @Override
    public void execute(){
      System.out.println(message + value);
    }
  }
  //value = "LocalClass"; //を外すとコンパイルエラー
  message = "Hello, ";
  return new A();
  }
}