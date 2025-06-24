package ex_16_Assignments;

import java.util.Scanner;

public class Year_Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        //check for leap year using if-ele
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year :" + year);
        } else {
            System.out.println("Not a leap year :" + year);

        }
    }
}