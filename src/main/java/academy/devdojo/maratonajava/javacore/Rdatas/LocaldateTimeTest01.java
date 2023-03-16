package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocaldateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 6);
        LocalTime time = LocalTime.of(20,30,21);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
