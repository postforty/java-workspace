package section12.practice.ex04;

/*

Starting the flying car
Driving the flying car
Flying the flying car
Stopping the flying car

 */

interface Machine {
    void start();
    void stop();
}

interface Drivable {
    void drive();
}

interface Flyvable {
    void fly();
}

interface FlyingMachine extends Machine, Drivable, Flyvable {}

class FlyingCar implements FlyingMachine {
    @Override
    public void drive() {
        System.out.println("Driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the sky");
    }

    @Override
    public void start() {
        System.out.println("Starting the flying car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the flying car");
    }
}

public class Practice1204 {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();

        myFlyingCar.start();
        myFlyingCar.drive();
        myFlyingCar.fly();
        myFlyingCar.stop();

    }
}
