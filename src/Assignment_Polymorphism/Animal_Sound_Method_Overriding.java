package Assignment_Polymorphism;

public class Animal_Sound_Method_Overriding {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        Animal c1 = new Cat();
        Animal c2 = new Cow();

        d1.sound();
        c1.sound();
        c2.sound();
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}


class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}
