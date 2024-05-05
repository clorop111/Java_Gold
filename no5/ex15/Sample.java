package ex15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) throws Exception {
        Path sample = Paths.get("ex15", "sample.txt");
        if(Files.exists(sample) == false) {
            Files.createFile(sample);
        }

        Path outFile = Paths.get("ex15", "sample_bk.xt");
        Files.copy(sample, outFile);

        Path dir = Paths.get("ex15", "dir");
        Path dest = dir.resolve(Paths.get("sample.txt"));
        Files.move(sample, dest);

    }   
}
