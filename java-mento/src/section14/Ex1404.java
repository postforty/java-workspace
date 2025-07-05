package section14;

import java.util.Scanner;

public class Ex1404 {
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

      result = 10 / number;
  
      System.out.println("나누기 결과: " + result);
    }
  }
}
