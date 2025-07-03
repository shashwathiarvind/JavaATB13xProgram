package Assignment_Polymorphism;

public class Multiply_Numbers {

    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int result1 = m1.multiply(1, 2);
        System.out.println(result1);
        int result2 = m1.multiply(6, 3, 0);
        System.out.println(result2);
    }
}

class MathOperations {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}