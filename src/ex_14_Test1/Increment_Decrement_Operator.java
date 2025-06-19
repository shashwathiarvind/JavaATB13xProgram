package ex_14_Test1;

public class Increment_Decrement_Operator {
    public static void main(String[] args) {
       /* program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.

                **Requirements:**
        - Show the difference between ++i and i++
                - Show the difference between --i and i--
                - Print values before and after operations


        */
    //pre n post increment
        System.out.println("Pre increment n Post increment");
        int a = 5;
        System.out.println(a);
        int b = ++a; // pre increment
        System.out.println("++a : a =" + a + ", b =" + b);
        int x = 5;
        System.out.println(x);
        int y = x++; //post increment
        System.out.println("x++: x = " + x + ", y =" + y); // y is 5 and x is 6

        //pre-decrement
        System.out.println("\n pre decrement n post decrement");
        int a1 = 10;
        System.out.println(a1);
        int a2 = --a1;
        System.out.println("--a1: a1 =" + a2 + ", +a2");

        int x1 = 10;
        System.out.println(x1);
        int y1 = x1--;
        System.out.println(y1);


    }

}
