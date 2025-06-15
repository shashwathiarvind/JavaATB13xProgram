package ex_UserInput;

public class Lab077_Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]);//gives ArrayIndexOutOfBoundException as value is not assigned
    }
}
