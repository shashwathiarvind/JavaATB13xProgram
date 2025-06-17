package ex_11_While_Loop;

public class Lab131_While_Interview {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 0) {
            System.out.println(i);
            i++; // no output as condition 0 < 0 is false
        }
    }
}
