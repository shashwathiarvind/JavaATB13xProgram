package ex_22_OOPS_Inheritance;

public class Animal_Sound_Simulator {
    public static void main(String[] args) {


        cat c= new cat();
        c.makeSound();
        c.meow();
    }
}

class Animal{

    void makeSound(){
        System.out.println("Animal");
    }
}

class cat extends Animal{

    void meow()
    {
        System.out.println("Cat Makes meow meow");

    }

}
