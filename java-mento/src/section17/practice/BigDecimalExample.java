package section17.practice;

import java.math.BigDecimal;

public class BigDecimalExample {
  public static void main(String[] args) {
    double num = 0.1;
    double result = num + num;
    result += num; // 0.30000000000000004
    // 부동 소수점 오차

    System.out.println(result);

    String numToStr = String.valueOf(num);
    
    // 부동 소수점 오차 해결 방법
    // BigDecimal numBigDec = new BigDecimal("0.1"); // 인수는 문자열 형태의 숫자를 넣어야 함
    BigDecimal numBigDec = new BigDecimal(numToStr); // 인수는 문자열 형태의 숫자를 넣어야 함
    result = numBigDec.add(numBigDec).add(numBigDec).doubleValue(); // 메서드 체이닝
    System.out.println(result);
  }
}
