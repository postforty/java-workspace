package section11.polymorphism.computer;

public class Lz extends Computer {
  @Override
  void powerOn() {
    System.out.println("삑~ 컴퓨터가 켜졌습니다.");
    System.out.println("사랑해요 LZ");
  }
}
