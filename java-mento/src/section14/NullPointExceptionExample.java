package section14;

public class NullPointExceptionExample {
  public static void main(String[] args) {
    String[] strArr = null;

    System.out.println(strArr[0]); // 비체크 예외(실행 중에 예외 발생)

    // Person person = new Person(); // 체크 예외(정의 안된 클래스에 접근한 경우)
  }
}
