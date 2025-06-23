package ex_16_Assignments;

import java.util.Scanner;

public class Even_Odd_Number_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2==0)
        {
            System.out.println( "Even number");
        } else{
            System.out.println( "Odd number");
        }
    }
}
