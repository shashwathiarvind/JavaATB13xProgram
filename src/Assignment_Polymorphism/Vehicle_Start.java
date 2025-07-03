package Assignment_Polymorphism;

public class Vehicle_Start {
    public static void main(String[] args) {
        Vehicle b1 = new Bike();
        Vehicle c3 = new Car();

        b1.start();
        c3.start();
    }
}
class Vehicle {
    void start() {
        System.out.println("Starting  vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Kick start  bike");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Turn the key , start the car");
    }
}
