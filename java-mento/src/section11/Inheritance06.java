package section11;

class ParentInheritance {
  void display() {
    System.out.println("부모 클래스의 display() 메서드입니다.");
  }
}

class ChildInheritance extends ParentInheritance {
  @Override
  void display() {
    System.out.println("자식 클래스의 display() 메서드입니다.");
  }
  // 메서드 오버로딩
  void display(String str) {
    System.out.println(str);
  }
  // 메서드 오버로딩
  void display(String str, int number) {
    System.out.println(str);
    System.out.println(number);
  }
}

public class Inheritance06 {
  public static void main(String[] args) {
    ChildInheritance child = new ChildInheritance();
    child.display();
    child.display("메서드 오버 로딩");
    child.display("메서드 오버 로딩", 1);
  }
}
