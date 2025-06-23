package ex_16_Assignments;

import java.util.Scanner;

public class Largest_Of_Three_Numbers_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter the first Number");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Enter the second Number");
        int n2 = scanner.nextInt();
        System.out.println("Enter the third Number");
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n2 >= n3) {
            System.out.println("Largest number is....." + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Largest number is....." + n2);
        } else {
            System.out.println("Largest number is....." + n3);
        }

    }
}
