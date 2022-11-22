package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversatio = LocalDateTime.of(1999, Month.SEPTEMBER, 26, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversatio, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversatio, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversatio, now));
        System.out.println(ChronoUnit.YEARS.between(aniversatio, now));
    }
}
