package ex_21_OOPS_Constructor;

public class Lab188_Assignment_Default {
    public static void main(String[] args) {
        Student1 s1= new Student1();
        System.out.println(s1.firstName);
        System.out.println(s1.lastName);
        System.out.println(s1.age);
    }
}
class Student1 {
    String firstName;
    String lastName;
    int age;


    Student1() {
        firstName = "Shashwathi";
        lastName = "Arvind";
        age = 33;

    }
}