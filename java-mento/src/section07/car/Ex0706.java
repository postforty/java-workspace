package section07.car;

// main 메서드가 있는 실행용 클래스
public class Ex0706 {
  public static void main(String[] args) {
    Car car = new Car();

    // System.out.println(car);
    car.wheel = 4;
    System.out.println(car.wheel);

    // 속성(상태) 값 변경
    car.wheel = 2;
    System.out.println(car.wheel);

    // 기능(메서드 호출)
    car.drive();
    car.drive();
    car.drive();
  }
}
