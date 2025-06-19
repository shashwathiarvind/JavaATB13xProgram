package ex_14_Test1;

public class Arithmetic_Assignment_Operator {
    public static void main(String[] args) {
       // **Requirements:**
        //Use +, -, *, /, % operator
        // Demonstrate assignment operators (=, +=, -=, *=, /=)
        //Show the results of each operation
        System.out.println("Arithmetic operators");
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //assignment operators
        System.out.println("Assignment Operators");
        int c = 25;
        System.out.println("Value of c: " + c);
        c += 5; // c = c+ 5
        System.out.println("c + = 5 :" + c);
        c -= 10;
        System.out.println("c -= 10 :" + c);
        c *= 15;
        System.out.println("c *= 10 :" + c);
        c /= 20;
        System.out.println("c /= 10 :" + c);

    }
}
