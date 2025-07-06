package Assignment_Super;

public class Parent_Class_Variable {

    public static void main(String[] args) {
        Child2 c3 = new Child2();
        c3.values();
    }
}
class Parent2 {
    int value = 150;
}

class Child2 extends Parent2 {
    int value = 200;

    void values() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}
