package ex_07_Increment_DecrementOperator;

public class Lab084_Increment_DecrementAssignment {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i); // i=1, ++i = 2, i++= 2
    }
}
