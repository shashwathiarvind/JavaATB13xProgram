package Exceptions_Assignment;

public class Generic_Catch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;

        } catch (Exception e) {
            System.out.println( e);
        }

        System.out.println("Program continues after exception handling.");
    }
}












