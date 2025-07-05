package section03;

public class Ex0312 {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;

    System.out.println(num2);

    // 복합 대입 연산자
    // - 산술 연산자(+, -, *, /, %)와 복합하여 사용
    
    // num2 = num2 + num1; // 2 + 1 = 3
    num2 += num1; // 위 연산을 복합 대입 연산자로 변환
    System.out.println(num2); // 3

    // num1 = num1 % num2;
    num1 %= num2;
    System.out.println(num1); // 1 % 3 = 1(나머지)
  }
}
