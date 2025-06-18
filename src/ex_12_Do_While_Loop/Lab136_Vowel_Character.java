package ex_12_Do_While_Loop;

import java.util.Scanner;

public class Lab136_Vowel_Character {
    public static void main(String[] args) {
        //to check if character is vowel or not
       // Scanner scanner = new Scanner(System.in);
        char ch = 'a'; // used without using scanner



        System.out.println("Enter if character is a vowel");
       // char ch = scanner.next().toLowerCase().charAt(0);

     // using switch  //switch (ch){
         //   case  'a', 'e' ,'i', 'o', 'u' -> System.out.println("vowel");
          //  default -> System.out.println("consonant");

            //using if
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("vowels");
            }
            else {
                System.out.println("consonants");
            }
        }

    }

