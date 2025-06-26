package ex_18_Arrays;

import java.util.Scanner;

public class Lab165_User_Input_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array in int only");
        int size = scanner.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Enter numbers");
            marks[i] = scanner.nextInt();
        }
        System.out.println("------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }

        }
    }

