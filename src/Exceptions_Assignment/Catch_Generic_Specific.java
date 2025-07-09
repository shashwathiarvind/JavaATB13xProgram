package Exceptions_Assignment;

public class Catch_Generic_Specific {
    public static void main(String[] args) {

        // Part 1: Using catch(Exception e)
        System.out.println(" Using catch(Exception e):");
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (Exception e) {
            System.out.println(e);
        }

        // Part 2: Using catch(NullPointerException e)
        System.out.println(" Using catch(NullPointerException e):");
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println( e);
        }
    }
}
