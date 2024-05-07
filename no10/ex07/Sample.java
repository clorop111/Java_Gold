package ex07;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sample {
    public static void main(String[] args) throws Exception {
        // インスタンスを作成して、プロパティファイルを読み込み
        Properties prop = new Properties();
        prop.load(new FileReader("db_setting.propaties"));

        // プロパティファイルのすべての値を取得
        //prop.forEach((k, v) -> System.out.println(k + ":" + v));

        // キーの一覧を取り出して、キーに一致する値をコンソールに表示
        Set keys = prop.keySet();
        for (Object key : keys) {
            System.out.println(prop.get(key));
        }
    }    
}
