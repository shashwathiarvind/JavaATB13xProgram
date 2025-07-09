package Exceptions_Assignment;

public class Division_Task1 {
    public static void main(String[] args) {
        try {
            int num = 10;
            int result = num / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Cannot divide by zero.");
        }
    }
}
