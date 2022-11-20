package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingao");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 0);
        calendar.add(Calendar.HOUR, 12);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}

/** 113 - Classes Utilitárias - Calendar
 *
 * - A classe Calendar (pacote java.util) é uma classe abstrata (que não pode ser
 * instanciada usando new) que fornece métodos para efetuar a conversão entre um
 * momento específico no tempo e um conjunto de campos de calendário.
 * */
