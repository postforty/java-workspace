package section04;

public class Ex0406 {
  public static void main(String[] args) {
    int age = 10;
    // age = 99;
    System.out.printf("당신의 나이는 %d세입니다.", age);

    if (age >= 20) {
      System.out.println("성인입니다.");
    } else { // age >= 20가 아닌 모든 조건
      System.out.println("미성년자입니다.");
    }
  }
}
