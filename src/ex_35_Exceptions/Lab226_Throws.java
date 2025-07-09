package ex_35_Exceptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab226_Throws {
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
