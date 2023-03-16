package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("19990926", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("1999-09-26+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("1999-09-26", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("1999-09-26T22:10:04.112122", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = now.format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("26/09/1999", formatterBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("21.November.2022", formatterGR);
        System.out.println(parseGR);
    }
}
