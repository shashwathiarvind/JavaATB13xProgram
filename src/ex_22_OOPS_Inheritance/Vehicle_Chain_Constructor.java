package ex_22_OOPS_Inheritance;

public class Vehicle_Chain_Constructor {
    public static void main(String[] args) {
        Bike B= new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");

    }
}
class Bike extends Vehicle{
    Bike()
    {
        System.out.println("Bike is ready");
    }
}
