package section10.car;

public class Ex10_24 {
  public static void main(String[] args) {
    Car car = new Car();
    car.ride();

    Bus bus = new Bus(10);
    bus.takePerson();
    bus.ride();

    SchoolBus schoolBus = new SchoolBus(10);
    schoolBus.takePerson();
    schoolBus.ride();
  }
}
