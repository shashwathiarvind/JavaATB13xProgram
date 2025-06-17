package ex_09_Switch;

import java.util.Scanner;

public class Lab099_Switch_Without_Break {
    public static void main(String[] args) {
        //int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day 1 to 7"); // 1 to 7 => 1 being monday, 2 tues, so on
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                //    break;
            case 2:
                System.out.println("Tues");
                // break;
            case 3:
                System.out.println("Wed");
                //   break;
            case 4:
                System.out.println("Thur");
                //  break;
            case 5:
                System.out.println("Fri");
                //    break;
            case 6:
                System.out.println("Sat");
                //    break;
            case 7:
                System.out.println("Sun");
                // break;
            default:
                System.out.println("Not allowed");
        }
    }
}
