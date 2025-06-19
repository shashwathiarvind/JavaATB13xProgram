package ex_14_Test1;

import java.util.Scanner;

public class Largest_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

            System.out.print("Enter the first number ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt(); // Read the third integer

            int largest;

           // if-else if statements to find the largest number
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);

            scanner.close();
        }
    }

