package section10;

public class HouseDog extends Dog {

    HouseDog(String name) {
       super(name);
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    // overriding
    @Override
    void sleep() {
        super.sleep();
        System.out.println(this.name + " in house");
    }
}
