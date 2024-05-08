package ex28;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) {
        Path p = Paths.get("a/b/c/../../d");
        System.out.println(p.normalize());
    }
    
}
