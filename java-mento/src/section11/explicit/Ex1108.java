package section11.explicit;

public class Ex1108 {
  public static void main(String[] args) {
    Bike b = new FourWheelBike("짱구"); // 자동 형변환

    b.info();
    b.ride();
    // b.addWheel(); // 부모 타입에 정의되지 않은 메서드 이기 때문에 호출 불가!

    System.out.println("---");

    FourWheelBike fourWheelBike = (FourWheelBike) b;
    fourWheelBike.addWheel(); // 강제 형변환 했기 때문에 자식 클래스에만 정의된 메서드 호출 가능!
    fourWheelBike.info();
  }
}
