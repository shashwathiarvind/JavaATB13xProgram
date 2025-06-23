package ex_16_Assignments;

import java.util.Scanner;

public class Max_Of_Two_Numbers_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter the number1");
        Scanner scanner= new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int number2 = scanner.nextInt();

        if(number1>number2)
        {
            System.out.println("Maximum number is  " + "number 1");
        } else if(number2>number1){
            System.out.println("Maximum number  is : " + "number 2");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}

