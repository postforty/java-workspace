package section04;

public class Ex0408 {
  public static void main(String[] args) {
    int age = 19;
    
    System.out.printf("당신의 나이는 %d세입니다.", age);
    
    // 조건문 사용시 주의!!!
    // 조건식이 잘못 지정된 예
    if (age > 6) {
      System.out.println("성인입니다.");
    } else if (age > 13) {
      System.out.println("청소년입니다.");
    } else if (age > 19) {
      System.out.println("어린이입니다.");
    } else { 
      System.out.println("유아입니다.");
    }
  }
}
