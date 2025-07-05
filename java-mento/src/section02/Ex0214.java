package section02;

public class Ex0214 {
  public static void main(String[] args) {
    // 기본자료형: 실수(소수점 있음)
    double num1 = 1.2345d; // 실수의 기본값으 double
    double num2 = 1.2345; // double 타입은 d 생략 가능
    float num3 = 1.2345f; // float는 반드시 f를 붙임

    // 실수 타입의 표현 범위
    // 부동 소수점 방식
    float num4 = 1.0123456789f; // 4byte(2^32)
    double num5 = 1.0123456789; // 8byte(2^64)

    System.out.println("float:\t" + num4);
    System.out.println("double:\t" + num5);
  }
}
