package ex04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("sample.txt");
        BufferedReader reader = new BufferedReader(fr);
        try (reader) {
            reader.lines().forEach(System.out::println);
        }
    }
}    
