package ex_24_Multilevel_Inheritance;

public class Lab196_Multilevel {
    public static void main(String[] args) {
        Son arvind = new Son();
        // Son s1 = new Father();
        // Son s1 = new GrandFather();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();

        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();
    }
    }
