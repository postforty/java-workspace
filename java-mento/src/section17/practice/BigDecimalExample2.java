package section17.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample2 {
  public static void main(String[] args) {
    String num = "1.1234567890";

    System.out.println(
        new BigDecimal(num).setScale(0, RoundingMode.FLOOR) // 소수점 이하 절사
    );

    System.out.println(
        new BigDecimal(num).setScale(0, RoundingMode.CEILING) // 소수점 이하 절사 1 증가
    );

    num = "1.123";

    System.out.println(
        new BigDecimal(num).setScale(10) // 1.1230000000
    );

    num = "1.1230000000";

    System.out.println(
        new BigDecimal(num).stripTrailingZeros() // 1.123
    );
  }
}
