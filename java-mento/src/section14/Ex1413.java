package section14;

import java.util.Scanner;

// 사용자 정의 예외 클래스
class InputAgeErrorException extends Exception {
  private int start;
  private int end;
  InputAgeErrorException(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String getMessage() {
    return "나이는 " + this.start + " ~ " + this.end + " 사이의 값만 입력할 수 있습니다.";
  }
}

public class Ex1413 {
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
  
        // 사용자 정의 예외 클래스 객체 생성 예외 던지기
        if (age < 0 || age > 200) {
          throw new InputAgeErrorException(0, 200);
        }

        System.out.println("당신의 나이는 " + age + "세입니다.");
      } catch (InputAgeErrorException e) {
        System.out.println(e.getMessage());
      }
    }
    
    scan.close();
  }
}
