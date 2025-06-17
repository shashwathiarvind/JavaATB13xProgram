package ex_09_Switch;

import java.util.Scanner;

public class Lab100_Switch_Marks {
    public static void main(String[] args) {
        //int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks "); // 1 to 7 => 1 being monday, 2 tues, so on
        int marks = scanner.nextInt();

        switch (marks) {
            case 1:
                System.out.println("Marks >=90");
                break;
            case 2:
                System.out.println("Marks > 70");
                break;
            case 3:
                System.out.println("Marks > 65");
                break;
            case 4:
                System.out.println("Marks > 50");
                break;
            case 5:
                System.out.println("Marks > 35");
                break;
            case 6:
                System.out.println("Marks < 35");
                break;
//            case 7:
//                System.out.println("Sun");
//                break;
            default:
                System.out.println("Fail");
        }
    }
}
