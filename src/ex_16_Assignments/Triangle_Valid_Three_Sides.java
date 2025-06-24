package ex_16_Assignments;

import java.util.Scanner;

public class Triangle_Valid_Three_Sides {
    public static void main(String[] args) {
        System.out.println("Enter the side1");
        Scanner scanner= new Scanner(System.in);
        int s1 = scanner.nextInt();
        System.out.println("Enter the side2");
        int s2 = scanner.nextInt();
        System.out.println("Enter the side3");
        int s3 = scanner.nextInt();
        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2){ //s1,s2,s3->s1+s2>s3,s2+s3>s1,s3+s1>s2
            System.out.print("This is a valid triangle");

            if(s1==s2 && s2==s3 && s3==s1){
                System.out.println("Equilateral triangle");
            }else if(s1==s2 || s2==s3 ||s3==s1 ){
                System.out.println("Isosceles Triangle");
            }else{
                System.out.println("Scalene Triangle");
            }
        }
    }
}
