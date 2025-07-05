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

public class Ex11_15 {
  public static void main(String[] args) {
    Farm farm = new Farm();
    // farm.sound(new Pig());

    Pig pig = new Pig();
    farm.sound(pig);

    Cow cow = new Cow();
    farm.sound(cow);

    Tiger tiger = new Tiger();
    farm.sound(tiger);
  }
}
