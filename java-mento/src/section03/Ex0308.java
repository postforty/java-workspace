package section03;

public class Ex0308 {
  public static void main(String[] args) {
    // 논리연산자 논리 부정, 뒤집기(!)
    // - 논리 연산의 평가 결과는 true/false
    boolean isHuman = false;
    System.out.println(isHuman);
    isHuman = !isHuman;
    System.out.println(isHuman); // true
    isHuman = !isHuman;
    System.out.println(isHuman); // false
  }
}
