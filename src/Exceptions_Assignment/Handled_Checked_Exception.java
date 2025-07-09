package Exceptions_Assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Handled_Checked_Exception {
    public static void main(String[] args) {
        try {
            // Try to open a file that may not exist
            FileReader reader = new FileReader("example.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}

