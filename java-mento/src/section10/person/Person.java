package section10.person;

public class Person {
  String name;
  int age;

  // 부모 클래스에서 생성자를 정의하면 자식 클래스에서 생성자 정의를 강제함
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
