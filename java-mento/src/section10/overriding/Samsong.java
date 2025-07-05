package section10.overriding;

public class Samsong extends Computer {
  // 메서드 오버라이딩(method overriding)
  // - 부모 클래스에 정의된 메서드가 자식 클래스에 없으면 부모 클래스의 메서드 호출
  // - 부모 클래스에 정의된 메서드가 자식 클래스에 있으면 메서드 오버라이딩이며 자식 클래스의 메서드가 최우선 적으로 호출됨(메서드 재정의라고도 표현함)

  // @Override 어노테이션을 붙여서 부모 클래스의 메서드를 오버라이딩한 것을 명시적으로 나타냄(생략해도 정상 동작하나 가독성을 고려 붙여주는 것을 습관화 하자!)
  @Override
  void powerOn() {
    // System.out.println("삑~ 컴퓨터가 켜졌습니다.");
    // 위 코드는 부모 클래스 메서드와 중복
    // super 키워드 사용
    super.powerOn(); // 부모 클래스 메서드 호출
    System.out.println("아이 러브 삼송");
  }

  @Override
  void powerOff() {
    // System.out.println("컴퓨터가 종료됩니다.");
    super.powerOff(); // 부모 클래스 메서드 호출
    System.out.println("사랑합니다, 고객님!");
  }
}
