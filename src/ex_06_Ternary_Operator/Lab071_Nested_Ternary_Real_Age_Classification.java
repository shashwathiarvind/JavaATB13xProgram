package ex_06_Ternary_Operator;

public class Lab071_Nested_Ternary_Real_Age_Classification {
    public static void main(String[] args) {
        //age = 30;
        //age<18 -> Minor
        //age>60 ->Senior citizen
        //18<age>65 ->adult
        int age = 30;
        String result = (age < 18) ? "Minor" : (age < 60 ? "Adult" : "Senior");
        System.out.println(result);

    }
}
