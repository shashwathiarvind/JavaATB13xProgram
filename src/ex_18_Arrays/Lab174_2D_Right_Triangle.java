package ex_18_Arrays;

import java.util.Scanner;

public class Lab174_2D_Right_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter a n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
