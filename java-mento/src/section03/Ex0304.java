package section03;

public class Ex0304 {
  public static void main(String[] args) {
    int num = 1;
    // 증감 연산자의 위치
    // 주의: 전위(prefix), 후위(postfix)
    // System.out.println(num++); // 후위: 1
    System.out.println(++num); // 전위: 2
    System.out.println(num); // 2

    System.out.println("---");

    num = 1;
    System.out.println(num); // 1
    System.out.println(--num); // 0
  }
}
