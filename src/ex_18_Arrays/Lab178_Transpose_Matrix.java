package ex_18_Arrays;

public class Lab178_Transpose_Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] transpose_matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                transpose_matrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose_matrix.length; i++) {

            for (int j = 0; j < transpose_matrix[i].length; j++) {
                System.out.print(transpose_matrix[i][j] + "   |  ");

            }
            System.out.println();
        }
    }
}