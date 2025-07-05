package section14;

import java.util.Scanner;

public class Ex1412 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int age = 0;

    while(true) {
      try {
        System.out.print("나이를 입력하세요: ");
        age = scan.nextInt();
  
        if (age == -1) {
          break; // 프로그램 종료
        }
  
        // 유효성 검사(사용자의 입력이 유효한지 확인)
        if (age < 0 || age > 200) {
          throw new Exception("나이는 0 ~ 200 사이의 값만 입력할 수 있습니다."); 
        }

        System.out.println("당신의 나이는 " + age + "세입니다.");
      } catch (Exception e) {
        System.out.println(e.getMessage()); // getMessage() 호출하여 예외 메시지 출력
      }
    }
    
    scan.close();
  }
}
