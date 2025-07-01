package ex_21_OOPS_Constructor;

public class Lab189_Parameterized_Constructor_Assignment {


public static void main(String[] args) {
    // Creating object using parameterized constructor
    Student s1 = new Student("Shashwathi", 33);
    System.out.println(s1.name);
    System.out.println(s1.age);

}
}
class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
}