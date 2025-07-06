package Assignment_Super;

public class Parent_Class_method {
    public static void main(String[] args) {
        Child1 c2 = new Child1();
        c2.display1();
    }
}
class Parent1 {
    void display1() {
        System.out.println("Parent method calling");
    }
}

class Child1 extends Parent1 {
    void display() {
        super.display1(); // Call to parent method
        System.out.println("Child method calling");
    }
}
