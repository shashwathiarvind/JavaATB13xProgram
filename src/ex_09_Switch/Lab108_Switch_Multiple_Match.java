package ex_09_Switch;

public class Lab108_Switch_Multiple_Match {
    public static void main(String[] args) {
        int code = 006;
        switch (code) {
            case 001,002,003:   // can have multiple match together
                System.out.println("electrical gadget");
                break;
            case 004,006,007:
                System.out.println("Mech gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
