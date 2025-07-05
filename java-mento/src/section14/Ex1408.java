package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1408 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int result = 0;

    try {
      System.out.print("숫자 입력: ");
      int number = scan.nextInt();
      result = 10 / number;
      System.out.println("나누기 결과: " + result);
    } catch (ArithmeticException e) {
      System.out.println("입력하신 내용을 계산할 수 없습니다.");
    } catch (InputMismatchException e) {
      System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
      scan.next();
    }
    // 오류 발생 여부와 상관 없이 반드시 실행되는 코드
    // try-catch는 반드시 한쌍으로 사용
    // finally는 사용하지 않을 수도 있음
    finally {
      scan.close();
      System.out.println("프로그램 종료!");
    }

  }
}
