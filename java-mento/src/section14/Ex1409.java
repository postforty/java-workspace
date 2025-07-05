package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsExceptionExample {
  void checkYourSelf(Scanner scan) {
    System.out.println("1. 사람과 어울리는 것이 좋다.");
    System.out.println("2. 혼자 있는 것이 좋다.");
    System.out.print("선택: ");

    // 예외가 발생하는 쪽에서 예외 처리
    try {
      int check = scan.nextInt();
  
      if (check == 1) {
        System.out.println("당신은 ENFP");
      } else if (check == 2) {
        System.out.println("당신은 ISFP");
      } else {
        System.out.println("1, 2번 중 하나를 입력하세요!");
      }
    } catch (InputMismatchException e) {
      System.out.println("키보드 입력이 잘못되었습니다.");
    }
  }
}

public class Ex1409 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("--- 성격 유형 검사 시작 ---");
    ThrowsExceptionExample example = new ThrowsExceptionExample();
    example.checkYourSelf(scan);

    scan.close();
  }
}
