package section02;

import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    // Scanner를 이용한 표준 입력
    // java.util API(Application Programming Interface) 이용
    Scanner scanner = new Scanner(System.in); // Scanner 타입 객체 생성
    System.out.print("당신의 나이를 입력하세요 >>> ");
    int age = scanner.nextInt();
    System.out.printf("제 나이는 %d세 입니다.\n", age);
    scanner.close(); // 메모리에서 제거!
  }

}
