package ex_18_Arrays;

import java.util.Scanner;

public class Lab175_2D_Multiplication_Array_Interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size_of_the_table = scanner.nextInt();

        for (int i = 0; i < size_of_the_table ; i++) {
            for (int j = 0; j < size_of_the_table ; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }

    }
}
