package section12.practice;

abstract class Bike {
  int wheel;

  Bike(int wheel) {
    this.wheel = wheel;
  }

  void info() {
    System.out.println("이 자전거는 " + this.wheel + "발 자전거입니다.");
  }

  abstract int getWheel();
}

class ChildBike extends Bike {
  // ChildBike(int wheel) {} // 부모 클래스가 추상 클래스일때 부모 클래스의 생성자를 호출 해야 함
  ChildBike(int wheel) {
    super(wheel);
  }

  @Override
  int getWheel() {
    return this.wheel;
  }
}

class Practice1202 {
  public static void main(String[] args) {
    // Bike bike = new Bike(2); // 추상 클래스는 객체 생성 불가
    ChildBike childBike = new ChildBike(4);
    childBike.info();
    System.out.println(childBike.getWheel());
  }
}
