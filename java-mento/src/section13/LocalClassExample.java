package section13;

class LocalClass {
  private int speed = 10;

  public void getUnit(String unitName) {

    class Unit {
      void move() {
        // unitName += " 님"; // 내부 클래스 외부의 매개 변수의 값 변경 불가
        // System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
        String newUnitName = unitName + " 님";
        System.out.println(newUnitName + "이 " + speed + " 속도로 이동합니다.");
      }
    }

    Unit unit = new Unit();
    unit.move();

  }
}

public class LocalClassExample {
  public static void main(String[] args) {
    LocalClass localClass = new LocalClass();
    localClass.getUnit("마린");
  }
}
