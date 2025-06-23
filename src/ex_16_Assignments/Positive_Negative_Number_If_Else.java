package ex_16_Assignments;

import java.util.Scanner;

public class Positive_Negative_Number_If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("num" + ":Postive number");
        } else if (number < 0) {
            System.out.println("num" + ":Negative number");
        } else {
            System.out.println("num" + ":Zero number");

        }
    }
}
