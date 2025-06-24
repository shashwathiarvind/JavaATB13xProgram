package ex_16_Assignments;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {
        int balance = 10000;
        int remaining_bal;

        //Enter the amount to withdraw
        System.out.println("Enter the amount to withdraw multiples of 100: ");
        Scanner scanner = new Scanner(System.in);
        int withdraw_amount = scanner.nextInt();

        if (withdraw_amount <= 0) {
            System.out.println("Invalid amount");
        } else if (withdraw_amount > balance) {
            System.out.println("Insufficient balance");
        } else if (withdraw_amount % 100 != 0) {
            System.out.println("Please enter the amount in multiples of 100");
        } else {
            remaining_bal = balance - withdraw_amount;
            System.out.println("Withdraw Successful");
            System.out.println("Remaining Balance is: " + remaining_bal);
        }
    }
}
