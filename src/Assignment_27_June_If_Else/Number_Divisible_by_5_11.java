package Assignment_27_June_If_Else;

import java.util.Scanner;

public class Number_Divisible_by_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 5 and 11
        if ((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println(number + " is divisible by both 5 and 11");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11");
        }
    }
}

