package academy.devdojo.maratonajava.javacore.Rdatas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 21);
        System.out.println(date.getYear()); // ano
        System.out.println(date.getMonthValue()); // mês
        System.out.println("Dia da semana: " + date.getDayOfWeek()); // dia semana
        System.out.println("Dia do mês: " + date.getDayOfMonth()); // dia do mês
        System.out.println("O mês tem: " + date.lengthOfMonth()); // quantos dias tem o mês
        System.out.println("Ano bissexto: " + date.isLeapYear()); // ano bissexto
        System.out.println("Data atual: " + LocalDate.now()); // data atual
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(date);
    }
}
