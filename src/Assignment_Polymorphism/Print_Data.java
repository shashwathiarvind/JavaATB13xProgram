package Assignment_Polymorphism;

public class Print_Data {
    public static void main(String[] args) {
        Printer p1= new Printer();
        p1.printData("Hello!");
        p1.printData(321);
        p1.printData(35.67f);
    }
}
class Printer {
    void printData(String data) {
        System.out.println(data);
    }
    void printData(int data) {
        System.out.println(data);
    }
    void printData(float data) {
        System.out.println(data);
    }
}
