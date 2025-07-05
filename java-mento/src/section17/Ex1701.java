package section17;

// 함수형 인터페이스(명시적으로 어노테이션을 붙이자!)
@FunctionalInterface
interface Calc {
  int add(int x, int y);
  // int min(int x, int y); // 람다식을 사용할 경우 추상 메서드는 단 하나만 정의 가능
}

// 1. 인터페이스 구현 클래스
class Calculation implements Calc {
  @Override
  public int add(int x, int y) {
    return x + y;
  }
  // @Override
  // public int min(int x, int y) {
  //   return x - y;
  // }
}

public class Ex1701 {
  public static void main(String[] args) {
    Calculation calculation = new Calculation();
    int result = calculation.add(1, 2);
    System.out.println(result);

    // 2. 익명 클래스 사용
    Calc anonymousClassCalculation = new Calc() {
      @Override
      public int add(int x, int y) {
        return x + y;
      }
      // @Override
      // public int min(int x, int y) {
      //   return x - y;
      // }
    };
    result = anonymousClassCalculation.add(1, 2);
    System.out.println(result);

    // 3. 람다식
    // Calc lambdaCalculation = (int x, int y) -> {
    //   return x + y;
    // };
    // Calc lambdaCalculation = (int x, int y) -> x + y;
    Calc lambdaCalculation = (x, y) -> x + y;

    result = lambdaCalculation.add(1, 2);
    System.out.println(result);

  }
}
