package section10.person;

public class Customer extends Person {
  int memberId;

  Customer(String name, int age, int memberId) {
    super(name, age); // 부모 클래스 생성자 호출
    this.memberId = memberId; // Customer 클래스에서만 가지고 있는 속성(Person 클래스에는 없음)
  }

  void enter() {
    System.out.printf("회원번호: %d(%s, %d세) 님 입장하셨습니다.", this.memberId, this.name, this. age);
    System.out.println();
  }
}
