package ex24;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Sample {
    public static void main(String[] args) {
        try (   Reader a = new FileReader("sample1.txt");
                Reader b = new FileReader("sample2.txt");
                Reader c = new FileReader("sample3.java")) {
            } catch (IOException e) {
                // do something
            }

            // here
    }
}
