package section14;

import java.util.Scanner;

public class Ex1405 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int result = 0;

    // 무한루프로 프로그램이 멈추지 않고 나누기를 수행하기를 기대
    // 하지만 0을 입력하면 강제 종료됨
    // 어떻게 이 문제를 해결할 수 있을까?
    while (true) {
      System.out.print("숫자 입력: ");
      int number = scan.nextInt();

      // result = 10 / 0; // 0으로 나눌 수 없음(ArithmeticException)

      // 예외 처리
      try {
        result = 10 / number; // ArithmeticException 오류가 발생하면 catch로 오류를 던짐
        System.out.println("나누기 결과: " + result);
      } catch(ArithmeticException e) { // ArithmeticException 오류를 잡아서 블럭내 코드를 실행함
        System.out.println("입력하신 내용을 계산할 수 없습니다.");
      }
    }
  }
}
