package Assignment_Super;

public class Parent_Class_Constructor {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Call to parent constructor
        System.out.println("Child class constructor");
    }
}
