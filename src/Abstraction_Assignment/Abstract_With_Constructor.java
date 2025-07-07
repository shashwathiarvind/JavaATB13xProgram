package Abstraction_Assignment;

public class Abstract_With_Constructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
abstract class MyAbstract {
    MyAbstract() {
        System.out.println("Abstract class constructor called");
    }

    abstract void display();
}

// Concrete class
class MyClass extends MyAbstract {
    void display() {
        System.out.println("Method from abstract class");
    }
}

