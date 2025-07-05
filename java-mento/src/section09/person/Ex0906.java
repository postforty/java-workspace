package section09.person;

class Person {
  String name;
  int age;

  // 생성자 정의
  // Person(String n, int a) {
  //   name = n;
  //   age = a;
  // }
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Ex0906 {
  public static void main(String[] args) {
    Person person = new Person("김일남", 99);

    System.out.println(person.name);
    System.out.println(person.age);
  }
}
