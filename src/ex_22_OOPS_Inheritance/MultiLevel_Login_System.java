package ex_22_OOPS_Inheritance;

public class MultiLevel_Login_System {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();


    }
}

class User{

    void login(){

        System.out.println("This is login");

    }
}
class AdminUser extends  User{
    void accessAdminPanel()
    {
        System.out.println("This is accessAdminPanel");
    }

}
class SuperAdmin extends  AdminUser{
    void shutdownSystem()
    {
        System.out.println("This is  SuperAdmin shut down System");
    }
}


