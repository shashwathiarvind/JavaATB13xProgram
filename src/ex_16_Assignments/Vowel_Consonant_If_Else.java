package ex_16_Assignments;

import java.util.Scanner;

public class Vowel_Consonant_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner scanner= new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println( "Is a vowel" + ch);
            }
            else  {
                System.out.println("Is a consonant" + ch);
            }
        }
        else {
            System.out.println("Invalid character");
        }
    }
}


