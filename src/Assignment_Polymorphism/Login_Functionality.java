package Assignment_Polymorphism;

public class Login_Functionality {
    public static void main(String[] args) {
        User u1 = new RegularUser();
        u1.login();
        User u2 = new User();
        u2.login();
    }
}
class User {
    void login() {
        System.out.println("User login");
    }
}
class AdminUser extends User {
    @Override
    void login() {
        System.out.println("Admin login:");
    }
}
class RegularUser extends User {
    @Override
    void login() {
        System.out.println("Regular user login:");
    }
}
