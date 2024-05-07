package ex08;

import java.util.Properties;
import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception {
        // インスタンスを作成して、プロパティファイルを読み込み
        Properties prop = new Properties();
        prop.load(new FileReader("db_setting.propaties"));

        // プロパティファイルのすべての値を取得
        prop.list(System.out);
    }    
}