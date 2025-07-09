package Exceptions_Assignment;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(" try started");

            try {
                int[] arr = {1, 2, 3};
                System.out.println( arr[5]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurred");
            }

            int result = a / b; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(" ArithmeticException occurred");
        }

        System.out.println("Program continues");
    }
}
