package ex_18_Arrays;

import java.util.Arrays;

public class Lab163_Arrays {
    public static void main(String[] args) {
        int[] marks = { 2, 3, 4, 5, 1};
        System.out.println(" -------");
        Arrays.sort(marks);//it will sort arrays in descending order
        for (int i = 0; i < marks.length ; i++)
        {System.out.println(marks[i]);
        }

    }

}
