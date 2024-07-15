package section11.interface_case;

interface Predator {
    String getFood();
}

class Animal implements Predator {
    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return "any food";
    }
}

class Tiger extends Animal {
    @Override
    public String getFood() {
        return "tiger food";
    }
}

class Lion extends Animal {
    @Override
    public String getFood() {
        return "lion food";
    }
}

class ZooKeeper {
    void feed(Predator animal) {
        System.out.println("feed " + animal.getFood());
    }
}

public class Jump1102 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        tiger.setName("tiger");

        Lion lion = new Lion();
        lion.setName("lion");

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
