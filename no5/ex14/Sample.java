package ex14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) throws Exception{
        Path dir = Paths.get("ex14", "dir");
        Path file = dir.resolve(Paths.get("data.txt"));
        Files.createFile(file);   
    }
}
