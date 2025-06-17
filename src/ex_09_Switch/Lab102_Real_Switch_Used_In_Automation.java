package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab102_Real_Switch_Used_In_Automation {
    public static void main(String[] args) {
        //web automation
        //I will ask user to give me input from browser which he wants to
        //use to I will start automation in that browser

        // String browser = args[0];
        // CLI option also can be used but best is to use scanner
        //System.out.println(browser);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter browser name which you want to start");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // incase of case sensitivity converting into lowercase


        switch (browser) {
            case "chrome" :
                System.out.println("Starting chrome");
                System.out.println("-------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox" :
                System.out.println("Starting in firefox browser");
                break;
            case "edge" :
                System.out.println("Starting in edge");
            default:
                System.out.println("I have no idea which browser is this:");
                break;


        }
    }
}
