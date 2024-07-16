package section12.practice.ex03;

/*

Driving on the road
Flying in the sky

 */

interface Drivable {
    void drive();
}

interface Flyvable {
    void fly();
}

class FlyingCar implements Drivable, Flyvable {
    @Override
    public void drive() {
        System.out.println("Driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the sky");
    }
}

public class Practice1203 {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();

        myFlyingCar.drive();
        myFlyingCar.fly();

    }
}
