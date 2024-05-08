package ex30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("sample.java");
            boolean result = Files.deleteIfExists(path);
            if (result) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } catch (IOException e) {
            System.out.println("C");
        }
    }
}
