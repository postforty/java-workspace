package section10.ex05;

public class Jump1005 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("poppy");
        houseDog.sleep();
        houseDog.guardHouse();

        Dog dog = houseDog;
        // dog.guardHouse(); // 사용 불가
        dog.sleep();

    }
}
