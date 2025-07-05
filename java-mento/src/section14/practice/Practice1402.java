package section14.practice;

import java.util.Scanner;

public class Practice1402 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    int count = 0;
    int data = 0;
    int sum = 0;

    // 사용자가 음수를 입력하면 sum에 누적하지 말것!
    // - 음수를 입력하면 고의로 예외를 일으킬것(throw new 사용)!
    // 총 5개의 숫자를 입력 받아 sum에 누적할 것!

    while(count < 5) {
      try {
        System.out.print("숫자를 입력하세요: ");
        data = scan.nextInt();
  
        if (data < 0) {
          throw new Exception("음수는 입력할 수 없습니다.");
        }
  
        sum += data;
        count++;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println("숫자 합 : " + sum);

    scan.close();
  }
  
}
