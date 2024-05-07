package ex11;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class Sample {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileReader(
            "sample.properties",
            Charset.forName("UTF-8")));
        
        System.out.println(prop.getProperty("test"));
    }
}

// Charsetクラスを使用