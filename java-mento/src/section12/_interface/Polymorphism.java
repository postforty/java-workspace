package section12._interface;

interface I {
  public abstract void printClassName();
}

class A implements I {
  @Override
  public void printClassName() {
    System.out.println("A 클래스");
  }
}

class B implements I {
  @Override
  public void printClassName() {
    System.out.println("B 클래스");
  }
}

class C implements I {
  @Override
  public void printClassName() {
    System.out.println("C 클래스");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    // I i = new I(); // 인터페이스는 객체 생성 불가!
    A a = new A();
    B b = new B();
    C c = new C();

    a.printClassName();
    b.printClassName();
    c.printClassName();

    // 인터페이스는 타입으로 사용 가능 -> 다형성
    I ia = a;
    I ib = b;
    I ic = c;

    ia.printClassName();
    ib.printClassName();
    ic.printClassName();
  }
}
