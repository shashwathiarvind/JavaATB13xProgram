package ex_35_Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Lab225_Interview {
    public static void main(String[] args) {
        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}

