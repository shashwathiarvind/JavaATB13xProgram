package Abstraction_Assignment;

public class Multiple_Inheritance_Using_Interface {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.print();
        d1.show();
    }
}
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }
}
