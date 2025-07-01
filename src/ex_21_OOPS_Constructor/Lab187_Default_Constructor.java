package ex_21_OOPS_Constructor;

public class Lab187_Default_Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
       // c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}
class Car {
    String name;
    int year;
    String model;

    //default constructor

    Car() {
        name = "nexon";
        year = 2025;
        model = "xxx";



    }
}
