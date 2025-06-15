package ex_07_Increment_DecrementOperator;

public class Lab081_Increment_DecrementOperator2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        //post -increment = print first then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post++);
    }
}
