package section11.polymorphism.computer;

public class Samsong extends Computer {
  @Override
  void powerOn() {
    System.out.println("삑~ 컴퓨터가 켜졌습니다.");
    System.out.println("아이 러브 삼송");
  }
}
