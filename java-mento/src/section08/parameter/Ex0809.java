package section08.parameter;

public class Ex0809 {
  public static void main(String[] args) {
    Calc calc = new Calc();
    calc.sum(3, 2); // 매개변수(parameter)가 2개이므로 인수(argument) 2개를 넣어줌
    calc.sum(30, 20); // 매개변수(parameter)가 2개이므로 인수(argument) 2개를 넣어줌
    // 메서드는 재사용이 가능
  }
}
