package section11.practice;

class Car {}

class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportCar extends OpenCar {}

public class Practice1101 {
  public static void main(String[] args) {
    Car c1 = new Bus(); // 자동 형변환, 상속 관계이므로 가능
    Car c2 = new SchoolBus(); // 자동 형변환, 상속 관계이므로 가능
    SchoolBus sb1 = new SchoolBus(); // 가능
    // SchoolBus sb2 = new Bus(); // 불가능
    // SchoolBus sb3 = new Car(); // 불가능

    Car c3 = new OpenCar(); // 자동 형변환, 상속 관계이므로 가능
    OpenCar oc1 = new OpenCar(); // 가능
    OpenCar oc2 = new SportCar(); // 자동 형변환, 상속 관계이므로 가능
    // Bus ob1 = new OpenCar(); // 불가능
    // Bus ob1 = new SportCar(); // 불가능

    System.out.println(sb1 instanceof Bus);

  }
}
