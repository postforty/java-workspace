package section08.getter.setter;

public class Person {
  // 캡슐화(encapsulation)
  private int age; // 정보 은닉

  // setter 메서드 정의
  // setter 메서드 명명 규칙
  // - 메서드 명 앞에 set 키워드 붙임
  public void setAge(int num) {
    // 유효성 검사(매개변수의 인수가 유효한지 확인)
    if (num <= 0) {
      System.out.println("나이를 잘못 입력하셨습니다. 1 이상의 값을 넣어 주세요.");
    } else {
      age = num;
    }
  }

  // getter 메서드 정의
  // get 키워드를 메서드 명 앞에 붙임
  public int getAge() {
    return age;
  }
}
