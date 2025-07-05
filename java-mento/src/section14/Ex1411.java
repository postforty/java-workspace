package section14;

import java.util.Scanner;

public class Ex1411 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int value = 0;

    while(true) {
      try {
        System.out.print("숫자를 입력하세요(0 ~ 9) : ");
        value = scan.nextInt();
  
        if (value == -1) {
          break; // 프로그램 종료
        }
  
        if (value < 0 || value > 9) {
          // throw new를 이용해서 의도적으로 예외를 던짐
          throw new Exception("숫자의 허용범위가 아닙니다."); 
        }
  
        sum += value;
      } catch (Exception e) {
        System.out.println(e.getMessage()); // getMessage() 호출하여 예외 메시지 출력
      }
    }
    
    System.out.println("총합: " + sum);
    scan.close();
  }
}
