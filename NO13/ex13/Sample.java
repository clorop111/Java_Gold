package ex13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Sample {
    public static void main(String[] args) {
        Locale l = new Locale("en", "US");
        LocalDate today = LocalDate.of(2021, 4, 1);
        String mToday = today.format(
                DateTimeFormatter.ofLocalizedDate(
                    FormatStyle.MEDIUM).withLocale(l));
        String aToday = today.format(
                DateTimeFormatter.ofLocalizedDate(
                    FormatStyle.SHORT).withLocale(l));
        System.out.println(mToday);
        System.out.println(aToday);
    }    
}
