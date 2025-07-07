package Abstraction_Assignment;

public class Interface_Default_Static_Method {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}
interface Vehicle {
    default void start() {
        System.out.println("Vehicle started");
    }
    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}

// Class implementing the interface
class Car implements Vehicle {
}
