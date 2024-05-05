package ex08;

import java.io.Console;

public class Sample {
  public static void main(String[] args) {
    Console console = System.console();
    char[] password = console.readPassword();
    String str = console.readLine();
    System.out.println(str);
  }
}
