package ex_18_Arrays;

import java.util.Scanner;

public class Lab179_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the  matrix  ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print("Element at [" + i + "][" + j + "] ");
               // System.out.println(i + j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // diagonal sum
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Sum of the main diagonal elements: " + diagonalSum);

    }
}
