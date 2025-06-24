package ex_16_Assignments;

import java.util.Scanner;

public class Character_Is_Alphabet {
    public static void main(String[] args) {
        System.out.println("Enter any character");
        Scanner scanner= new Scanner(System.in);
        char cha = scanner.next().charAt(0);

        if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z')){
            System.out.println(": This is an Alphabet :" +cha );
        }else {
            System.out.println("Not a valid Input");
        }
    }
}
