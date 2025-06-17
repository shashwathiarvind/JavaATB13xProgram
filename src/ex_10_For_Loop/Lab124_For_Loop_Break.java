package ex_10_For_Loop;

public class Lab124_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if ( i == 5) {
                break; //cannot take break from if condition
            }
            else {
                System.out.println(i);
            }
        }
    }
}
