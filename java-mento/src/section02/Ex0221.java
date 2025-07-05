package section02;

public class Ex0221 {
  public static void main(String[] args) {
    // 형 변환(type casting)
    // - 정수 -> 정수
    // - 정수 -> 실수
    // - 실수 -> 실수
    // - 실수 -> 정수
    // - 문자 -> 정수
    // - ...
    // - 자료형의 크기(데이터 손실, 오차 발생 가능성)

    // 정수(int)를 실수(double) 타입으로 "자동 형변환"
    int num1 = 11; // 4byte
    double intToDouble = num1; // 8byte

    System.out.println(num1);
    System.out.println(intToDouble);

    System.out.println(num1 + intToDouble); // double 타입으로 평가(더 큰 타입으로 변환)
  }
}
