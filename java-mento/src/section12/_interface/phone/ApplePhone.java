package section12._interface.phone;

public class ApplePhone implements Phone {
  @Override
  public void openingLogo() {
    // 이모지 단축키: win + .
    System.out.println("🍎");
  }

  @Override
  public void powerOn() {
    openingLogo();
    System.out.println("핸드폰이 켜졌습니다.");
  }
}
