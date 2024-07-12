package section11.abstract_case;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " 냠냠");
    }

    abstract void makeSound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(this.name + " 멍멍");
    }
}

public class Ex1101 {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Dog dog = new Dog("happy");
        dog.makeSound();
        dog.eat();
    }
}
