package section10.car;

public class Bus extends Car {
  int peopleNum;

  Bus(int peopleNum) {
    this.peopleNum = peopleNum;
  }

  void takePerson() {
    System.out.println("승객이 버스에 탔습니다.");
    this.peopleNum++;
    System.out.println("탑승한 승객수: " + this.peopleNum + "명");
  }

  @Override
  void ride() {
    System.out.println("버스가 달립니다.");
  }
}
