package section10;

// Dog(sub), Animal(super)
public class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(this.name + " zzz");
    }
}
