package Assignment_Super;

public class Protected_Access_Modifier {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.doEat();
    }
}
class Animal {
    // Protected method
    protected void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void doEat() {
        eat(); // Accessing protected method from parent class
    }
}