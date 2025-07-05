package section12._interface.phone;

public class ThreeStarPhone implements Phone {
  @Override
  public void openingLogo() {
    System.out.println("⭐⭐⭐");
  }

  @Override
  public void powerOn() {
    openingLogo();
    System.out.println("핸드폰이 켜졌습니다.");
  }
}
