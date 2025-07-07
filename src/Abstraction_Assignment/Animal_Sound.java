package Abstraction_Assignment;

public class Animal_Sound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling makeSound() method
        dog.makeSound();
        cat.makeSound();
    }
}
abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}
