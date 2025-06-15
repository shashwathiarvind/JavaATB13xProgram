package ex_07_Increment_DecrementOperator;

public class Lab088_Increment_DecrementAssignment {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);
    }
}
