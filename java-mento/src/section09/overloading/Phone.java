package section09.overloading;

public class Phone {
  String brand;
  int series;
  String color = "검정색";

  // 생성자 오버로딩(Constructor Overloading)
  // 생성자를 직접 정의하면 기본 생성자는 사라짐
  // 이 경우 기본 생성자를 사용하려면 직접 정의해야 함(생성자 오버로딩).
  // 생성자 오버로딩을 통해 다양한 매개 변수를 정의할 수 있음.
  Phone() {}
  Phone(String b) {
    brand = b;
  }
  Phone(String b, int s) {
    brand = b;
    series = s;
  }
  Phone(String b, int s, String c) {
    brand = b;
    series = s;
    color = c;
  }
  // 주의! 매개 변수의 순서는 앞서 정의한 매개변수의 타입 순서와 중복되면 안됨!
  // Phone(String c, int s, String b) {
  //   brand = b;
  //   series = s;
  //   color = c;
  // }
  Phone(String c, String b, int s) {
    brand = b;
    series = s;
    color = c;
  }

  void phoneInfo() {
    System.out.println(color + " " + brand + " " + series);
  }
}
