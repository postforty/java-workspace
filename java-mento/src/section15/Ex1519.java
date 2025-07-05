package section15;

import java.util.Calendar;

public class Ex1519 {
  public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();

    int year = cal.get(Calendar.YEAR);
    System.out.println(year);

    int month = cal.get(Calendar.MONTH);
    System.out.println(month);

    int date = cal.get(Calendar.DATE);
    System.out.println(date);

    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println(dayOfMonth);
  }
}
