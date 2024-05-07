package ex11;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Sample2 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new InputStreamReader(
            new FileInputStream("sample.properties"),
            "UTF-8"
        ));
        System.out.println(prop.getProperty("test"));
    }
}

// InputStreamReaderクラスを使用
