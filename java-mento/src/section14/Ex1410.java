package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsExceptionExample {
  // throws 를 적용하지 않아도 호출하는 쪽에서 예외 처리하면 결과는 같음
  // 왜 throws를 이용해서 예외 던지기를 할까?
  // - 메서드를 호출하는 쪽에서 해당 예외가 발생할 수 있는 것을 명시적으로 알려주기 위함
  // - 이 과정이 없으면 호출하는 쪽에서 예외처리를 진행하지 않는 실수를 할 수 있음.
  // - 예외 처리를 고려하도록 유도함으로써 코드의 안정성을 높임.
  void checkYourSelf(Scanner scan) throws InputMismatchException, Exception {
    System.out.println("1. 사람과 어울리는 것이 좋다.");
    System.out.println("2. 혼자 있는 것이 좋다.");
    System.out.print("선택: ");

    int check = scan.nextInt();

    if (check == 1) {
      System.out.println("당신은 ENFP");
    } else if (check == 2) {
      System.out.println("당신은 ISFP");
    } else {
      System.out.println("1, 2번 중 하나를 입력하세요!");
    }
  }
}

public class Ex1410 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("--- 성격 유형 검사 시작 ---");
    ThrowsExceptionExample example = new ThrowsExceptionExample();

    // checkYourSelf() 메서드를 사용하는 쪽에서 예외 처리
    try {
      example.checkYourSelf(scan);
    } catch (InputMismatchException e) {
      System.out.println("키보드 입력이 잘못되었습니다.");
    } catch (Exception e) {
      System.out.println("알 수 없는 예외가 발생했습니다.");
    }

    scan.close();
  }
}
