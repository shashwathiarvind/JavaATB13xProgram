package ex_16_Assignments;

import java.util.Scanner;

public class Smallest_Of_Three_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Enter third number");
        int n3 = scanner.nextInt();
        if (n1 <= n2 && n1 <= n3) {
            System.out.println("First number is smallest :" + n1);
        }
        else if (n2 <= n3 && n2 <= n1) {
            System.out.println("Second nimber is smallest:" + n2);
        } else {
            System.out.println("Third number is smallest:" + n3);
        }
    }
}
