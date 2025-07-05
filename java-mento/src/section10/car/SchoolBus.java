package section10.car;

public class SchoolBus extends Bus {

  SchoolBus(int peopleNum) {
    super(peopleNum);
  }

  @Override
  void takePerson() {
    System.out.println("학생이 버스에 탔습니다.");
    this.peopleNum++;
    System.out.println("탑승한 학생수: " + this.peopleNum + "명");
  }

  @Override
  void ride() {
    System.out.println("스쿨 버스가 달립니다.");
  }
}
