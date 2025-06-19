package ex_14_Test1;

import java.util.Scanner;

public class Number_Classification {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in); // Create a Scanner object

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt(); // Read the integer from the user

            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

            scanner.close(); // Close the scanner to release system resources
        }
    }

