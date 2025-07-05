package section12.practice;

// 캡슐화
// - 데이터(속성)와 그 데이터를 다루는 메서드(기능)를 하나의 단위(객체)로 묶는 것
// - 객체의 속성과 기능을 하나의 클래스 안에 응집시키는 것
// - 효과: 응집도 증가, 결합도 감소, 유지보수성 향상
class Car {
  // 정보 은닉
  // - 캡슐화된 객체 내부의 세부 구현 사항(주로 데이터)을 외부로 부터 숨기는 것
  // - 객체의 내부 상태에 직접 접근하지 못하게 함
  // - 미리 정의된 공개된 메서드(public)를 통해서만 접근 가능
  // - setter, getter
  // - 효과: 보안과 무결성(정확성) 유지, 응집도 증가, 결합도 감소, 단순화(복잡한 내부 구현을 노출하지 않고 필요한 기능만 제공)
  private int speed; 

  Car() {
    this.speed = 0;
  }

  public void accelerate() {
    this.speed += 10;
    System.out.println("가속! 현재 속도 " + this.speed);
  }

  public void brake() {
    if (this.speed >= 10) {
      this.speed -= 10;
    } else {
      this.speed = 0;
    }
    System.out.println("감소! 현재 속도 " + this.speed);
  }

  public int getSpeed() {
    return this.speed;
  }
}

public class Practice1205 {
  public static void main(String[] args) {
    Car car = new Car();
    car.accelerate();
    car.accelerate();
    car.accelerate();
    car.brake();
    car.brake();
    car.brake();
    car.brake();

    // car.speed -= 100;
    System.out.println("현재 속도 " + car.getSpeed());
  }
}
