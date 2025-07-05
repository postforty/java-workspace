package section15;

import java.util.Calendar;

public class Ex1520 {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();

    // 원하는 날짜 설정하기
    cal.set(2024, 5, 1); // 5는 6월을 의미함

    int year = cal.get(Calendar.YEAR);
    System.out.println(year);

    int month = cal.get(Calendar.MONTH);
    System.out.println(month);

    int date = cal.get(Calendar.DATE);
    System.out.println(date);

    // 지정된 달의 마지막 일자를 구함
    int lastOfDate = cal.getActualMaximum(Calendar.DATE);
    System.out.println(lastOfDate);
    int startOfDate = cal.getActualMinimum(Calendar.DATE);
    System.out.println(startOfDate);

    // 지정한 달의 시작하는 요일 구하기
    int week = cal.get(Calendar.DAY_OF_WEEK);
    System.out.println(week);
  }
}
