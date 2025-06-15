package ex_UserInput;

public class Lab076_Lab_UserInput_CLI {
    public static void main(String[] args) {
       // int age = 65;
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String canIVote = age >=  18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
