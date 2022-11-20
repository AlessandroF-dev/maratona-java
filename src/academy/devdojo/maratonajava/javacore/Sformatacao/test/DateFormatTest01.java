package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat [] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // 20/11/2022 09:54
        df[1] = DateFormat.getDateInstance();// 20 de nov. de 2022
        df[2] = DateFormat.getDateTimeInstance();// 20 de nov. de 2022 09:54:03
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);// 20/11/2022
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);// 20 de nov. de 2022
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);// 20 de novembro de 2022
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);// domingo, 20 de novembro de 2022

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
