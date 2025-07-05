package section12._interface._extends;

// 인터페이스 상속
interface I1 {
  public static final int MAX = 100;
  int MIN = 10; // public static final 생략 가능
  void method1();
}

interface I2 {
  void method2();
}

// 상속
interface I3 extends I1 {
  void method3();
}

// 다중 상속
interface I4 extends I1, I2 {
  void method4();
}

class C implements I4 {
  public void method1() {
  }
  public void method2() {
  }
  public void method4() {
  }
}

public class ExampleInterface {

}
