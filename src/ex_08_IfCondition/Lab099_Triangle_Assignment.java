package ex_08_IfCondition;

import java.util.Scanner;

public class Lab099_Triangle_Assignment {
    public static void main(String[] args) {
       /* Write a program that classifies a triangle
         based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal),
        or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
         */
    Scanner scanner = new Scanner(System.in); // take input frm user
        int a;
        int b;
        int c;
        System.out.println("Length for 3 sides of Triangle:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ( a==b&&b==c) {
            System.out.println("Equilateral Triangle");
        }
        else if(a==b || b==c|| c==a) {
            System.out.println("Isoceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
        }



    }


