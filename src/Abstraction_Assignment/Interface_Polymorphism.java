package Abstraction_Assignment;

public class Interface_Polymorphism {
    public static void main(String[] args) {
        Playable instrument;

        instrument = new Guitar();
        instrument.play();

        instrument = new Piano();
        instrument.play();
    }
}
interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}
