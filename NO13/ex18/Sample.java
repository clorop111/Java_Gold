package ex18;

import java.io.Console;

public class Sample {
    public static void main(String[] args) {
        Console console = System.console();
        var name = console.readLine("name > ");
        var pass = console.readLine("pass > ");
        System.out.println("name : " + name + ", pass : " +String.valueOf(pass));
    }    
}
