package section07;

class Person {
  // 클래스 정의
  // - 속성(상태)
  String name;
  int age;
  double height;

  // - 기능(행위)
  // 메서드(method)
  void run() {
    System.out.println(name + "달리기");
  }
}

public class Ex0702 {
  public static void main(String[] args) {
    Person person = new Person();

    person.name = "김일남";
    person.age = 99;
    person.height = 169.9;

    System.out.print(person.name + ", ");
    System.out.print(person.age + ", ");
    System.out.print(person.height + "\n");

    Person person2 = new Person();

    person2.name = "김이남";
    person2.age = 98;
    person2.height = 179.9;

    System.out.print(person2.name + ", ");
    System.out.print(person2.age + ", ");
    System.out.print(person2.height + "\n");

    person.run();
    person2.run();
  }
}
