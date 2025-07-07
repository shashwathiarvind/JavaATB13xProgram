package Abstraction_Assignment;

public class Abstract_Concrete {
    public static void main(String[] args) {
        Child c1= new Child();
        c1.display();
        c1.show();
    }
}
abstract class Parent {
    abstract void show();

    // Concrete method
    void display() {
        System.out.println("Concrete method in abstract class");
    }
}
class Child extends Parent {
    // Implementing abstract method
    void show() {
        System.out.println("Abstract method implemented");
    }
}
