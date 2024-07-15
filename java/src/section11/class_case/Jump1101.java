package section11.class_case;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {}
class Lion extends Animal {}
class Crocodile extends Animal {}

class ZooKeeper {
    void feed(Tiger tiger) {
        System.out.println("feed tiger food");
    }

    void feed(Lion lion) {
        System.out.println("feed lion food");
    }

    void feed(Crocodile crocodile) {
        System.out.println("feed crocodile food");
    }
}

public class Jump1101 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
    }
}
