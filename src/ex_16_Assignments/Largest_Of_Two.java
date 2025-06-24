package ex_16_Assignments;

import java.util.Scanner;

public class Largest_Of_Two {
    public static void main(String[] args) {
        System.out.println("Enter the First number");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Largest number is :" + n1);
        } else if (n2 > n1) {
            System.out.println("Largest number is :" + n2);
        } else{
                System.out.println("Both are Equal:");
            }
        }
    }

