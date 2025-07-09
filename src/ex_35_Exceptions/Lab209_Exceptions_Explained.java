package ex_35_Exceptions;

public class Lab209_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program!");
        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); // java.lang.NumberFormatException
        Integer output = 100/a; // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program!");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }

}

