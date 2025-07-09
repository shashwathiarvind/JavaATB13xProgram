package Exceptions_Assignment;

public class Throw_Exception_Catch {
    public static void main(String[] args) {
        try {
            // Manually throwing an exception
            throw new ArithmeticException("Manually thrown ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
