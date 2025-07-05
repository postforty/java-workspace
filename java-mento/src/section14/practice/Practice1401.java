package section14.practice;

public class Practice1401 {
  public static void main(String[] args) {
    int data = 10;
    double result = 0;

    try {
      result = (double)(data / 0);
    } catch (ArithmeticException e) {
      result = 0;
    }

    System.out.println("결과는: " + result);

    // 출력결과가 아래와 같이 출력되도록 해보세요!
    // 결과는: 0.0
  }
}
