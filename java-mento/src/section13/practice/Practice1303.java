package section13.practice;

class MyCar {
  private int price;
  private String name;

  public MyCar(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getInfo() {
    return "차량: " + this.name + ", 가격: " + price; 
  }

  public class Promotion {
    public int discount() {
      int discount = 0;
      discount = price / 100;
      return discount;
    }
  }
}

public class Practice1303 {
  public static void main(String[] args) {
    
    // 자동차 이름: 소나타
    // 가격: 4000
    MyCar mycar = new MyCar("소나타", 4000);
    MyCar.Promotion promotion = mycar.new Promotion();

    System.out.println(mycar.getInfo() + ", 할인금액: " + promotion.discount());
  }
}
