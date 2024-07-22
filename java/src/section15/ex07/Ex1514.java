package section15.ex07;

import java.util.Calendar;

public class Ex1514 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        // System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        // System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        int month = calendar.get(Calendar.MONTH);

        switch (month) {
            case Calendar.JULY:
                System.out.println("지금은 7월!");
                break;
            case Calendar.AUGUST:
                System.out.println("지금은 8월!");
                break;
            case Calendar.SEPTEMBER:
                System.out.println("지금은 9월!");
                break;
            default:
                break;
        }

        int amPm = calendar.get(Calendar.AM_PM);
        if (amPm == Calendar.AM) {
            System.out.println("지금은 오전!");
        } else {
            System.out.println("지금은 오후!");
        }
    }
}
