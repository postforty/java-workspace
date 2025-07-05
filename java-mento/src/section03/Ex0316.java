package section03;

public class Ex0316 {
  public static void main(String[] args) {
    // 삼항 연산자
    int num = 2 < 1 ? 1 : 2;
    System.out.println(num); // 2

    // 문자열 연결 연산자
    String s1 = "Hello";
    String s2 = "Java";
    System.out.println(s1 + " " + s2); // Hello Java: 문자열을 연결함(산술 연산자 아님)

    s1 += " ";
    s1 += s2;
    System.out.println(s1); // Hello Java: 복합 대입 연산자 가능
  }
}
