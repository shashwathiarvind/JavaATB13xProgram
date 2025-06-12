package ex_06_Ternary_Operator;

public class Lab072_Ternary_Operator_Max_Of_Three {
    public static void main(String[] args) {
        //Find Maximum between two numbers
        //Now we will be using logic building formula

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(max);

    }
}
