package ex_25_OOPS_Polymorphism;

public class Lab199_Real_MethodOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(3);
        h1.task(true);
    }
}

class Home{

    void task(){
        System.out.println("Task 1");
    }
    int task(int a){
        System.out.println("Task 1");
        return a;
    }
    boolean task(boolean a){
        return false;
    }

}
