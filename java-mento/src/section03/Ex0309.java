package section03;

public class Ex0309 {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;

    System.out.println(num1 + num2); // 5
    System.out.println(num1 - num2); // -1
    System.out.println(num1 * num2); // 6
    System.out.println(num2 / num1); // 1 (소수점은 버러짐)
    System.out.println(num2 % num1); // 1 (나머지)

    num2 = 5;
    System.out.println(num2 / num1); // 5 / 2 = 2(몫)
    System.out.println(num2 % num1); // 5 % 2 = 1(나머지)
  }
}
