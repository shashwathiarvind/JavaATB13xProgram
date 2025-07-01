package ex_21_OOPS_Constructor;

public class Lab185_Constructor {
    public static void main(String[] args) {
        Baby b = new Baby();
    }





}
class Baby {
    //Attribute/Instance Variable/member variable
    String name;
   //how to create default constructor
   Baby() {
       System.out.println("Hi i am default constructor");
   }

    //behavior
    void cry() {
        System.out.println("Cry");
    }
    void sleep() {
        System.out.println("Sleep");
    }
    void eat() {
        System.out.println("Eat");
    }
}