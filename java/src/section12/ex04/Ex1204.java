package section12.ex04;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}

class Ride {
    void start(Vehicle v) {
        v.start();
    }
    void stop(Vehicle v) {
        v.stop();
    }
}

public class Ex1204 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        Ride ride = new Ride();

        ride.start(myCar);
        ride.stop(myCar);
        ride.start(myBike);
        ride.stop(myBike);
    }
}
