package ex17;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.JAPAN);
        Locale.setDefault(Locale.US);

        NumberFormat a = NumberFormat.getInstance();
        NumberFormat b = NumberFormat.getIntegerInstance();
        NumberFormat c = NumberFormat.getCurrencyInstance();
        NumberFormat d = NumberFormat.getPercentInstance();

        System.out.println(a.format(1000.1));
        System.out.println(b.format(1000.1));
        System.out.println(c.format(1000.1));
        System.out.println(d.format(0.1));
     }
}
