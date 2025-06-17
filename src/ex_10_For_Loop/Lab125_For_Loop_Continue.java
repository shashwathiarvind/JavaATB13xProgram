package ex_10_For_Loop;

public class Lab125_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49 times

            if (i == 5) {
                continue; // here 5 is skipped in output as 5 == 5 which is true
            }
            System.out.println(i);
        }
    }
}