package ex_06_Ternary_Operator;

public class Lab074_Ternary_Operator_Even_Odd_Assignment {
    public static void main(String[] args) {
        int A = 19;
        int A1 = 20;
        String result =  (A % 2 == 0) ? "even" : "odd";
        String result1 = (A1 % 2 ==0) ? "even" : "odd";
        System.out.println(result);
        System.out.println(result1);

    }
}
