package ex_20_OOPS;

public class Lab182_OOps_P2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();

    }

    static class Student {
        String name;

        //default constructor same name as class name
        Student() {
            System.out.println("Default Constructor");

        }

        void sleep() {
            System.out.println("Hi");
        }
    }
}
