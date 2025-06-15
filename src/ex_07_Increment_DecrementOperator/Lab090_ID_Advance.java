package ex_07_Increment_DecrementOperator;

public class Lab090_ID_Advance {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //line no \ a \ b
        //5 \ 10 \NA
        //6 \ 11 \ 11
        //7 \ 12
    }
}
