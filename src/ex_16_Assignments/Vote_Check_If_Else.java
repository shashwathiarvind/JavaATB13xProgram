package ex_16_Assignments;

import java.util.Scanner;

public class Vote_Check_If_Else {
    public static void main(String[] args) {


        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Allowed to Vote" + age);
        } else {
            System.out.println("Not allowed to vote" + age);
        }
    }
}
