package section16.ex01;

import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("냐옹");
    }
}

public class Ex1604 {
    public static void makeAnimalsSound(List<? extends Animal> animals) {
        for(Animal animal: animals) {
            animal.sound();
        }
    }

    public static void addDog(List<? super Animal> animals) {
        animals.add(new Dog());
    }
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        
        System.out.println(animals);

        addDog(animals);
        System.out.println(animals);

        System.out.println(dogs);
        System.out.println(cats);

        makeAnimalsSound(dogs);
        makeAnimalsSound(cats);
        makeAnimalsSound(animals);
    }
}
