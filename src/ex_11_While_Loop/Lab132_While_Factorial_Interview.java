package ex_11_While_Loop;

import java.util.Scanner;

public class Lab132_While_Factorial_Interview {
    public static void main(String[] args) {
       //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial Program\nEnter number!");
        int number = scanner.nextInt();

        int factorial = 1;
        if(number <= 0) {
            System.out.println(factorial);
        } else{
            //calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;

            }

        }

        System.out.println("Factorial is ->" + factorial);
    }
}
