package ex_02_Java_Basics;

public class Lab024_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(a);
        System.out.print(a);
        System.out.print(a);

        System.out.println(a);
        System.out.printf("your variable name is %d", a);

        int b = 20;
        System.out.println(b);
        System.out.printf( "%d + %d" ,a,b);


    }
}
