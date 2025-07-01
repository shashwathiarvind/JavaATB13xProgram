package ex_20_OOPS;

public class Lab183_OOps_Cats {
    public static void main(String[] args) {


        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
        new Cat().running();
    }
}

class Cat {
    String name;

    void running() {
        System.out.println("Running");
    }
}