package ex_18_Arrays;

public class Lab177_Pyramid_Pattern {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <=rows; j++){
                System.out.print(" ");
            }
           for (int k = 1; k <= 2 * i-1; k++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
