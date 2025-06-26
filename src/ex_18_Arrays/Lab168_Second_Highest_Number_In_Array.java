package ex_18_Arrays;

import java.util.Arrays;

public class Lab168_Second_Highest_Number_In_Array {
    public static void main(String[] args) {
        //second largest number in array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //34 second largest
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);


    }
}
