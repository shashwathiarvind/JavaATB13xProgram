package ex_14_Test1;

public class Comparison_Logical_Operators {
    public static void main(String[] args) {
        /*Write a program that demonstrates comparison and logical operators.

                **Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
        - Use logical operators (&&, ||, !)
        - Print boolean results with explanatory message

        */
    //declare variables
        int num1 = 10;
        int num2 = 5;
        int num3 = 10;
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("Comparison Operator");
        //Equals operator
        System.out.println(num1 == num2); //false
        System.out.println(num1 == num3); //true
        //!=
        System.out.println(num1 != num2); //true
        //<
        System.out.println(num1 < num2); //false
        //>
        System.out.println(num1 > num2); // true

        //<=
        System.out.println(num1 <= num2); //false
        System.out.println( num1 <= num3); //true
        //>=
        System.out.println(num1 >= num2); //true
        System.out.println(num1 >= num3); //true

        System.out.println("Logical Operators\n");
        //logical &&
        System.out.println("is any one  conditions true? (b1 && b2): " + (b1 && b2));
        //Logical OR ||
        System.out.println("is any one  conditions true? (b1 || b2): " + (b1 || b2));
        //Logical !
        System.out.println("is b1 true?(!condition): " + (!b2));

    }

}
