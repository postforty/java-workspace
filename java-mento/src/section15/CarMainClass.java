package section15;

class Car extends Object {
  private String carName;
  private String company;

  public Car(String carName, String company) {
    this.carName = carName;
    this.company = company;
  }

  // Object 객체의 toString() 메서드는 객체의 문자 정보를 반환함
  // toString() 메서드를 오버라이딩하면 객체 문자 정보를 변경할 수 있음
  @Override
  public String toString() {
    return "차량명: " + this.carName + ", 제조사: " + this.company;
  }
}

public class CarMainClass {
  public static void main(String[] args) {
    Car car = new Car("소나타", "현대");
    
    System.out.println(car);
    // 오버라이딩 전
    // section15.Car@2ff4acd0
    // 오버라이딩 후
    // 차량명: 소나타, 제조사: 현대
  }
}
