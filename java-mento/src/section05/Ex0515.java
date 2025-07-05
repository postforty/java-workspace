package section05;

import java.util.Scanner;

public class Ex0515 {
  public static void main(String[] args) {
    // for문으로 변환하여 동일하게 동작하게 만들어 보세요!

    int computerNumber = (int) (Math.random() * 10) + 1;
    System.out.println(computerNumber);

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("찾는 숫자를 입력 >>> ");
      int personNumber = scan.nextInt();

      if (computerNumber == personNumber) {
        System.out.println("맞췄습니다.");
        break;
      } else {
        System.out.println("오답입니다.");
      }
    }
    
    System.out.println("맞추지 못했고 당신이 졌습니다!");

    scan.close();
  }
}
