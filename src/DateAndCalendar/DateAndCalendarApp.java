package DateAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarApp {
    public static void main(String[] args) {
        /**
         * Date
         * */
        Date date = new Date();
        long milisecond = date.getTime();

        System.out.println(date);
        System.out.println(milisecond);

        /**
         * Calendar
         * */
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date calendarGetTime = calendar.getTime();
        long dateGetTime = date.getTime();

        System.out.println(calendarGetTime);
        System.out.println(dateGetTime);
    }
}
