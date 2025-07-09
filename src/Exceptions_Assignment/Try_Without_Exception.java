package Exceptions_Assignment;

public class Try_Without_Exception {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 + 6; // No exception occurs
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("This will not be printed because no exception occurs.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
