package Assignment_Polymorphism;

public class Add_Two_Numbers_Method_Overloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
         int int1= c1.add(10, 20);
        System.out.println(int1);
        double d1 = c1.add(5.5, 4.3);
        System.out.println(d1);
    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}