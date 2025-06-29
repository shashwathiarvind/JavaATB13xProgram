package ex_18_Arrays;

public class Lab173_2D_Arrays_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //3*3
        //Rows->3
        //Columns->3
        //1,2,3
        //4,5,6
        //7,8,9
        System.out.println(matrix.length +"\n");

        for(int i = 0; i < matrix.length; i++) { //0,1,2
            for (int j = 0; j < matrix[i].length; j++) { //0,1,2
                System.out.print(matrix[i][j] + " | "); //within double quotes for space

            }
            System.out.println(); //for space
        }}}

