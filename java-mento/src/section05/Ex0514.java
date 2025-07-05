package section05;

import java.util.Scanner;

public class Ex0514 {
  public static void main(String[] args) {
    // System.out.println(Math.random()); // 0이상 1미만 실수형 난수 생성
    // System.out.println(Math.random() * 10); // 0이상 10미만 실수형 난수 생성
    // System.out.println((int)(Math.random() * 10)); // 0이상 10미만 정수형 난수 생성
    // System.out.println((int)(Math.random() * 10) + 1); // 1이상 10이하 정수형 난수 생성

    int computerNumber = (int)(Math.random() * 10) + 1;
    System.out.println(computerNumber);

    Scanner scan = new Scanner(System.in);
    int count = 1;

    while (true) {
      count++;

      System.out.print("찾는 숫자를 입력 >>> ");
      int personNumber = scan.nextInt();
  
      if (computerNumber == personNumber) {
        System.out.println("맞췄습니다.");
        break;
      } else if (count > 3) {
        System.out.println("맞추지 못했고 당신이 졌습니다!");
        break;
      } else {
        System.out.println("오답입니다.");
      }
    }

    scan.close();
  }
}
