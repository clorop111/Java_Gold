package ex61;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Sample {
    public static void main(String[] args) throws IOException{
        Path src = Paths.get("a/sample.txt");
        Path dest = Paths.get("dest");
        Files.move(src, dest);
    }
}
