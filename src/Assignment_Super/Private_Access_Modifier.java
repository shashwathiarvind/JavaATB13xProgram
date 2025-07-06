package Assignment_Super;

public class Private_Access_Modifier {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Name: " + s.getName());
    }
}
class Student {
    private String name = "Shashwathi";

    // Getter method
    public String getName() {
        return name;
    }
}

