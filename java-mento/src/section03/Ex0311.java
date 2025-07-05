package section03;

public class Ex0311 {
  public static void main(String[] args) {
    int result = 1000000 + 1000000;
    System.out.println(result); // 2000000
    result = 1000000 * 1000000;
    System.out.println(result); // 1,000,000,000,000 ??? 실제 출력 결과는 쓰레기 값 -727379968

    System.out.println("---");

    long num1 = 1000000L;
    long num2 = 1000000L;
    long resultLong = num1 * num2;
    System.out.println(resultLong); // 1,000,000,000,000
  }
}
