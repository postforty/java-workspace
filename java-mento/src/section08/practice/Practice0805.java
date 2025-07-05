package section08.practice;

public class Practice0805 {
  public static void main(String[] args) {
    Person lee = new Person();
    lee.setAge(-10); // 유효성 검사 적용해 보세요.
    lee.setAge(30);
    System.out.println("lee의 나이는 " + lee.getAge() + "세입니다.");
  }
}

class Person {
  private int age; // 정보 은닉

  void setAge(int num) {
    // if (num <= 0) {
    //   System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요.");
    // } else {
    //   age = num;
    // }

    // else 대신 return 사용한 경우 
    if (num <= 0) {
      System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요.");
      return;
    }
    age = num;
  }

  int getAge() {
    return age;
  }
}