package section15;

import java.util.Calendar;
import java.util.Scanner;

public class Ex1521 {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();

    Scanner scan = new Scanner(System.in);

    System.out.println("연도를 입력하세요");
    int year = scan.nextInt();

    System.out.println("월을 입력하세요");
    int month = scan.nextInt();

    cal.set(year, month-1, 1);

    System.out.println("일\t월\t화\t수\t목\t금\t토");

    // 요일은 1~7사이의 정수(1은 일요일)
    int week = cal.get(Calendar.DAY_OF_WEEK);
    // System.out.println(week);

    int lastOfDate = cal.getActualMaximum(Calendar.DATE);
    // System.out.println(lastOfDate);

    for(int i = 1; i < week; i++) {
      System.out.print("\t");
    }

    for(int i = 1; i <= lastOfDate; i++) {
      System.out.print(i + "\t");

      if (week % 7 == 0) {
        System.out.println();
      }

      week++;
    }

    System.out.println();

    scan.close();
  }
}
