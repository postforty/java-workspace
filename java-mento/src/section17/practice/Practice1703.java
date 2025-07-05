package section17.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

@FunctionalInterface
interface Calc {
  double round(int point);
}

public class Practice1703 {
  public static void main(String[] args) {
    double val = 34.1254886; // effective final

    Calc cal = (point) -> {
      // 람다식 내에서 외부 변수를 수정할 수 없음
      double val1 = new BigDecimal(val).setScale(point, RoundingMode.HALF_UP).doubleValue();
      return val1;
    };

    System.out.println("소수점 둘째 자리 반올림 : " + cal.round(2));
  }
}
