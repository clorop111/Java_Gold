package ex03;

import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws Exception{
        String fs = "C:/Users/ontec/Desktop/まとめ/NO5/sample.txt";
        FileReader reader = null;
        try {
            reader = new FileReader(fs);
            int i = 0;

            while ((i = reader.read()) != -1); {
                char c = (char) i;
                System.out.println(c);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }    
}
