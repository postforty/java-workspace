package section11.polymorphism;

class A {
  void run() {
    System.out.println("A 클래스의 run 메서드!");
  }
}
class B extends A {
  @Override
  void run() {
    System.out.println("B 클래스의 run 메서드!");
  }
  void fly() {
    System.out.println("A 클래스의 fly 메서드!");
  }
}
class C {}

public class Example {
  public static void main(String[] args) {
    B b = new B();
    b.run();
    b.fly();

    A b2 = b; // 자동 형변환
    b2.run();
    // b2.fly(); // A 클래스에 정의되지 않음 메서드이므로 사용 불가!

    B b3 = (B) b2; // 강제 형변환
    b3.run();
    b3.fly();
  }
}
