package Assignment_27_June_If_Else;

import java.util.Scanner;

public class Person_Is_Senior_Citizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an Adult");
        } else if (age >= 65) {
            System.out.println("You are a Senior Citizen");
        } else {
            System.out.println("Invalid age entered");
        }
    }
}
