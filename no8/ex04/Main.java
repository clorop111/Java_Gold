package ex04;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Sample sample = new Sample(null);
    List<String> messages = NotNullValidator.validate(sample);
    if (messages.isEmpty()) {
      System.out.println("valid object");
      return;
    }
    
  }
}
