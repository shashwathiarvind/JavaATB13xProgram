package Exceptions_Assignment;

public class Try_With_Multiple_Statements {
    public static void main(String[] args) {
        try {
            System.out.println("Starting of pgm");

            // This will throw ArithmeticException
            int result = 10 / 0;

            // These lines will NOT execute
            System.out.println("This will not print");
            int[] arr = new int[2];
            System.out.println(arr[5]); // Would throw ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block: Always runs");
        }
    }
}
