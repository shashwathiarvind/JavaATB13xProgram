package ex_13_Functions;

public class Lab_142_User_Defined_one {
    public static void main(String[] args) {
        int result = sum_of_number(3, 4);
        System.out.println(result);
    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }
    //if we dont want to return use void
    static void sum_of_number_no_return(int a, int b) {
        System.out.println(a+b);
    }

}
