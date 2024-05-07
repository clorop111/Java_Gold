package ex09;

import java.util.Properties;
import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception {
        // インスタンスを作成して、プロパティファイルを読み込み
        Properties prop = new Properties();
        prop.load(new FileReader("db_setting.propaties"));

        // nameというキーの値を取り出してコンソールに表示
        System.out.println(prop.getProperty("name"));
    }    
}
