package section12.phone;

abstract public class Phone {
  void powerOn() {
    openingLogo();
    System.out.println("핸드폰이 켜집니다.");
  }

  abstract void openingLogo();
}
