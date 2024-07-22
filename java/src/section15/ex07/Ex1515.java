package section15.ex07;

import java.util.Calendar;

public class Ex1515 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Date 객체
        // System.out.println("Date Object: " + calendar.getTime());
        
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.roll(Calendar.YEAR, false);
        calendar.roll(Calendar.YEAR, false);
        // System.out.println("Date Object: " + calendar.getTime());
        calendar.roll(Calendar.YEAR, true);
        System.out.println("Date Object: " + calendar.getTime());

        Calendar newCalendar = Calendar.getInstance();
        // System.out.println("Date Object: " + newCalendar.getTime());

        newCalendar.setTime(calendar.getTime());
        System.out.println("Date Object: " + newCalendar.getTime());

        
    }
}
