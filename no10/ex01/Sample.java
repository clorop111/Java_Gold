package ex01;

import java.util.Locale;

public class Sample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        // 国の表示
        System.out.println(locale.getCountry());
        // 言語の表示
        System.out.println(locale.getLanguage());
    }
}
