package Exceptions_Assignment;

public class Multiple_Catch {
    public static void main(String[] args) {
        try {
            int[] a = {10, 20, 30};
            int result = a[5] / 0; // This line may throw ArrayIndexOutOfBoundsException or ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getMessage());
        }
    }
}