package section13;

class Calculator {
  int value1;
  int value2;

  Calculator(int value1, int value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  // 인스턴스 내부 클래스(static 키워드 붙이면 안됨)
  // 외부 클래스의 속성과 기능을 사용할 수 있음
  class Calc {
    public int add() {
      return value1 + value2;
    }
  }
}

public class CalculatorExample {
  public static void main(String[] args) {
    Calculator calculator = new Calculator(1, 2);
    Calculator.Calc calc = calculator.new Calc(); // 내부 클래스의 객체 생성(외부 클래스의 객체를 통해서 생성 가능)
    int result = calc.add();
    System.out.println(result);
  }
}
