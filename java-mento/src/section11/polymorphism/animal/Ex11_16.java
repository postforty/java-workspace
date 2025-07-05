package section11.polymorphism.animal;

class Animal {
  void cry() {}
}

class Pig extends Animal {
  @Override
  void cry() {
    System.out.println("꿀꿀");
  }
}

public class Ex11_16 {
  public static void main(String[] args) {
    Pig pig1 = new Pig();
    Pig pig2 = new Pig();
    Animal animal = new Animal();
    Animal animal2 = pig2;

    // instanceof 연산자는 호출한 생성자를 통해 볼 결정
    // 객체(명) instanceof 클래스(타입)
    // 해당 객체가 해당 클래스의 인스턴스인지 묻는 연산자(true/fasle)
    System.out.println("pig1 instanceof Pig: " + (pig1 instanceof Pig));
    System.out.println("pig2 instanceof Pig: " + (pig2 instanceof Pig));
    System.out.println("animal instanceof Pig: " + (animal instanceof Pig));
    System.out.println("animal2 instanceof Pig: " + (animal2 instanceof Pig));

  }
}
