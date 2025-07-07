package Abstraction_Assignment;

public class Interface_Constant_SpeedLimit {
    public static void main(String[] args) {
        Car1 c2 = new Car1();
        c2.displaySpeedLimit();
        System.out.println("Accessing directly: " + SpeedLimit.MAX_SPEED + " km/h");
    }
}
interface SpeedLimit {
    int MAX_SPEED = 120;
}

class Car1 implements SpeedLimit {
    void displaySpeedLimit() {
        System.out.println("Maximum speed allowed: " + MAX_SPEED + " km/h");
    }
}
