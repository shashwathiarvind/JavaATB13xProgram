package ex_16_Assignments;

import java.util.Scanner;

public class Grade_Based_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks (0 - 100):");
        int marks = scanner.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("grade is A+");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade is A");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade is B");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade is C");
        } else if (marks >= 50 && marks <= 59)
        {System.out.println("Grade is D");
        } else if (marks >= 40 && marks <= 49)
        {
            System.out.println("Grade is E");
        } else {
            System.out.println("Below 40 is Fail");
        }
    } }







