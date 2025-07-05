package section09._this;

public class Ex0910 {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    p1.phoneInfo();

    Phone p2 = new Phone("갤럭시");
    p2.phoneInfo();

    Phone p3 = new Phone("갤럭시", 24);
    p3.phoneInfo();

    Phone p4 = new Phone("갤럭시", 24, "흰색");
    p4.phoneInfo();

    Phone p5 = new Phone("보라", "갤럭시", 24);
    p5.phoneInfo();

  }
}

class Phone {
  String brand;
  int series;
  String color = "검정색";

  Phone() {}
  Phone(String brand) {
    this.brand = brand;
  }

  Phone(String brand, int series) {
    this.brand = brand;
    this.series = series;
  }

  Phone(String brand, int series, String color) {
    // brand = b;
    // series = s;

    // this() 함수를 이용
    // - 앞에 정의된 생성자를 호출
    this(brand, series);
    this.color = color;
  }

  Phone(String color, String brand, int series) {
    // this.brand = brand;
    // this.series = series;
    this(brand, series); // this()는 가장 위에 작성해야 함
    this.color = color;
    // this(brand, series); // 불가
  }

  void phoneInfo() {
    // this는 객체(인스턴스) 자기 자신을 가리킴
    System.out.println(this.color + " " + this.brand + " " + this.series);
  }
}
