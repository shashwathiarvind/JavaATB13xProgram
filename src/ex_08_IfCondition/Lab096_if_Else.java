package ex_08_IfCondition;

import java.util.Scanner;

public class Lab096_if_Else {
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Allowed to Vote");
        }else {
            System.out.println("Not allowed to vote");
        }


    }
}
