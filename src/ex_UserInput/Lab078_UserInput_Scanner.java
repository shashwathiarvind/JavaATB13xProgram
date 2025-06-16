package ex_UserInput;

import java.util.Scanner;

public class Lab078_UserInput_Scanner {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age= scanner.nextInt();
        String canIVote = age >=  18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
