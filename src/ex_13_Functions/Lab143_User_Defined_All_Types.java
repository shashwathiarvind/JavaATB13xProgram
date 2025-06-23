package ex_13_Functions;

public class Lab143_User_Defined_All_Types {
    public static void main(String[] args) {
        //user defined functions
        //1.Without Parameters and without return type
        wp_wr_greet();

        //2.Without Parameters and with return type
        String msg = greet_with_hello_wp_With_RT();
        System.out.println(msg);

        //3.With Parameters and without return type
        greet_with_details("Shashu" , 65, 100);

        //4.With Parameters and with return type
       int sum = sum_of_two_numbers(3, 4);
        System.out.println(sum);

        }
        //1.Without Parameters and without return type
        //2.Without Parameters and with return type
        //3.With Parameters and without return type
        //4.With Parameters and with return type

        //1.Without Parameters and without return type
        static void wp_wr_greet() {
            System.out.println("Hi");
        }
    //2.Without Parameters and with return type
    static String greet_with_hello_wp_With_RT() {
        System.out.println("Hi");
        return "Hi how are you?";

    }
    //3.With Parameters and without return type
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" +name + "\nYour age is" + age +"\n your salary is ->" +salary);
    }
    //4.With Parameters and with return type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    }

