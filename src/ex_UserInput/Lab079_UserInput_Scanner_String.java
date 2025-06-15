package ex_UserInput;

import java.util.Scanner;

public class Lab079_UserInput_Scanner_String {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        //for double
        System.out.println("Enter Double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
        //for int
        System.out.println("Enter Int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);
    }
}
