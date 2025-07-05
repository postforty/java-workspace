package section07.car;

// 라이브러리용 클래스
public class Car {
  // 속성
  int wheel;

  // 생성자
  // - 객체를 생성하는 특별한 메서드
  // - 반드시 클래스명과 동일한 이름을 사용해야 함
  // - 직접 정의하지 않으면 기본 생성자 적용됨
  Car() {}

  // 기능(메서드)
  void drive() {
    System.out.println("달립니다.");
  }
}
