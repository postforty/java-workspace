package section12.multiple;

class C1 {
  void method1() {};
}
class C2 {
  void method2() {};
}
class C3 {
  void method3() {};
}

class A extends C1 {
  public void method1() {}
}
// 자바에서는 다중 상속 불가!
// class B extends C1, C2 {
//   public void method1() {}
//   public void method2() {}
// }
// class C extends C1, C2, C3 {
//   public void method1() {}
//   public void method2() {}
//   public void method3() {}
// }

public class ExampleClass {
  
}
