package section09;

class Snack {
  int price;

  void info() {
    System.out.println("과자의 가격은 " + price + "입니다.");
  }
}

public class Ex0902 {
  public static void main(String[] args) {
    Snack chip = new Snack();
    chip.price = 2000;
    chip.info();
  }
}
