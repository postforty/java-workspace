package section09._this;

class Person {
  String name;
  int age;

  // this 키워드를 사용하지 않은 경우
  // Person(String name, int age) {
  //   // 필드 초기화 불가
  //   name = name;
  //   age = age;
  // }

  // this 키워드 사용한 경우
  // - 매개 변수명을 필드명과 동일하게 사용 가능
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Ex0909 {
  public static void main(String[] args) {
    Person person = new Person("김일남", 99);

    System.out.println(person.name);
    System.out.println(person.age);
  }
}
