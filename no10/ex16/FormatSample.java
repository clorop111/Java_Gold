package ex16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatSample {
    public static void main(String[] args) {
        
        //Locale.setDefault(Locale.JAPAN);
        Locale.setDefault(Locale.US);

        DateTimeFormatter a =
                DateTimeFormatter.ofLocalizedDate(
                        FormatStyle.FULL);
        DateTimeFormatter b =
                DateTimeFormatter.ofLocalizedDate(
                        FormatStyle.LONG);
        DateTimeFormatter c =
                DateTimeFormatter.ofLocalizedDate(
                        FormatStyle.MEDIUM);
        DateTimeFormatter d =
                DateTimeFormatter.ofLocalizedDate(
                        FormatStyle.SHORT);

        LocalDate date = LocalDate.now();
        System.out.println(a.format(date));
        System.out.println(b.format(date));
        System.out.println(c.format(date));
        System.out.println(d.format(date));

    }
}
