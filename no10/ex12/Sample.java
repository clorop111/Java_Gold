package ex12;

import java.util.ResourceBundle;

public class Sample {
    public static void main(String[] args) throws Exception {
        ResourceBundle resource 
                = ResourceBundle.getBundle("sample");
        System.out.println(resource.getString("test"));
    }
}
