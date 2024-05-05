package ex16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Sample {
       public static void main(String[] args) throws Exception{
        Path sample = Paths.get("sample.txt");
        BufferedReader br = Files.newBufferedReader(sample);
        try (br) {
            br.lines().forEach(System.out::println);
        }

        BufferedWriter out = Files.newBufferedWriter(
            sample,
            StandardOpenOption.APPEND);
        try (out) {
            out.write("hello");
            out.newLine();
            out.write("Java");
            out.newLine();
        }
    }
}
