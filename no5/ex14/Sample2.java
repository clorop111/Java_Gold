package ex14;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample2 {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get("ex14", "a","b","c");
        if(Files.exists(dir) == false) {
            Files.createDirectories(dir);
            //Files.createDirectory(dir);
        }
        
        Path a = Paths.get("data.txt");
        Files.createFile(dir.resolve(a));

        System.out.println(dir.toAbsolutePath());
    }
}
