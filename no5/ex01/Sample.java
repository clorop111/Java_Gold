package ex01;

import java.io.File;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException{
        String fs = "C:/Users/ontec/Desktop/まとめ/NO5/sample.txt";
        File file = new File(fs);
        if(file.exists() == false) {
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());
    }
}