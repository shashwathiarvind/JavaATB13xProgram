package Assignment_27_June_If_Else;

import java.util.Scanner;

public class Website_Domain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter website URL: ");
        String url = scanner.next();

        if (url.endsWith(".com")) {
            System.out.println("The website type is for Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("The website type is for organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is for Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("The website type is for Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("The website type is for Network website");
        } else if (url.endsWith(".info")) {
            System.out.println("The website type is for Infomation");
        } else {
            System.out.println("The website type is Unknown");
        }
    }
}