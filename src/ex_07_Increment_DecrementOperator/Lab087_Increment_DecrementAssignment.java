package ex_07_Increment_DecrementOperator;

public class Lab087_Increment_DecrementAssignment {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
