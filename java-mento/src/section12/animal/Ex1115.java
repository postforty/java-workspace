package section12.animal;

abstract class Animal {
  // 추상 클래스의 특징
  // 1. 추상 메서드가 하나라도 존재하면 반드시 추상 클래스로 정의
  // 2. 추상 클래스를 상속하면 반드시 추상 메서드 오버라이딩 해야 함
  // 3. 추상 클래스는 스스로 객체를 생성할 수 없음

  // 추상 클래스를 사용하는 이유
  // 1. 반드시 정의해야 하는 메서드가 있다면 구현하도록 강제함
  // 2. (메서드 호출의) 표준화
  // 3. 유지보수성 좋아짐
  abstract void cry(); // 추상 메서드
}

class Pig extends Animal {
  @Override
  void cry() {
    System.out.println("꿀꿀");
  }
}
class Cow extends Animal {
  @Override
  void cry() {
    System.out.println("음머");
  }
}

class Tiger extends Animal {
  @Override
  void cry() {
    System.out.println("어흥");
  }
}

class Farm {
  void sound(Animal animal) {
    animal.cry();
  }
}

public class Ex1115 {
  public static void main(String[] args) {
    Farm farm = new Farm();
    
    // Animal animal = new Animal(); // 추상 클래스는 객체 생성 불가

  }
}
