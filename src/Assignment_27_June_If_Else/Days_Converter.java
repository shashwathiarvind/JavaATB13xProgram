package Assignment_27_June_If_Else;

import java.util.Scanner;

public class Days_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int totalDays = scanner.nextInt();
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }
}