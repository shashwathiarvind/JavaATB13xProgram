package ex_12_Do_While_Loop;

import java.util.Scanner;

public class Lab137_Leap_Year_Assignment {
    public static void main(String[] args) {
        //program to print if Create a program that
        // determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        //if condition to check leap or not
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year" + year);
        }else {
            System.out.println("Not a leap year");
        }

    }
}
