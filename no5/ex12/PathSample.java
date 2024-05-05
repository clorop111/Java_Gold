package ex12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {
    public static void main(String[] args) {

        Path path = Paths.get("sample.txt");
        System.out.println(path);

        Path peth = Paths.get("dir", "sample.txt");
        System.out.println(peth);

        Path pith = new File( "sample.txt").toPath();
        System.out.println(pith);

        File file = path.toFile();
        System.out.println(file);

        System.out.println(path.toAbsolutePath());
    }
}
