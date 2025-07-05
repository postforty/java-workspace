package section13.anonymous;

class Person {
  void mySelf() {
    System.out.println("나는 사람입니다.");
  }
}

// 클래스의 이름이 있는 경우
class Student extends Person {
  @Override
  void mySelf() {
    System.out.println("나는 학생입니다.");
  }
}

interface Animal {
  void cry();
}

public class Anonymous {
  public static void main(String[] args) {
    Person student = new Student();
    student.mySelf();

    // 익명 클래스
    // - 객체를 단한번만 생성하는 경우 사용
    Person teacher = new Person() {
      @Override
      void mySelf() {
        System.out.println("나는 강사입니다.");
      }
    };

    teacher.mySelf();

    // 인터페이스에서 익명 클래스
    Animal pig = new Animal() {
      @Override
      public void cry() {
        System.out.println("꿀꿀");
      }
    };

    pig.cry();
  }
}
