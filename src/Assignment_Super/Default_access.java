package Assignment_Super;

public class Default_access {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.showDetails(); // Accessible since both classes are in the same package
    }
}
class Student1 {
    void showDetails() {
        System.out.println("Details of student - accessible within same package");
    }
}