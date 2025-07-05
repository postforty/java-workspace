package section12.multiple;

// 인터페이스 다중 구현
interface I1 {
  void method1();
}
interface I2 {
  void method2();
}
interface I3 {
  void method3();
}

class A implements I1 {
  public void method1() {}
}
class B implements I1, I2 {
  public void method1() {}
  public void method2() {}
}
class C implements I1, I2, I3 {
  public void method1() {}
  public void method2() {}
  public void method3() {}
}

public class ExampleInterface {
  
}
