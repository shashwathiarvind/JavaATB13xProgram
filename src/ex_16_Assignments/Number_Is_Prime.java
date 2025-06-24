package ex_16_Assignments;

import java.util.Scanner;

public class Number_Is_Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 1) { // Numbers less than or equal to 1 are not prime
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;


            // Check for divisibility from 2 up to the square root of the number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) { // If divisible, it's not prime
                    isPrime = false;
                    break; // Exit the loop as soon as a divisor is found
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanner.close();
    }
}

