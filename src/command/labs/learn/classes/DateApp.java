package command.labs.learn.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DATE, 18);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
