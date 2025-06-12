package ex_06_Ternary_Operator;

public class Lab075_Ternary_Operator_Marks_Assignment {
    public static void main(String[] args) {
        int Marks = 90;
        String grade = (Marks >= 90) ? "A+" : (Marks >= 75) ? "A" : (Marks >=60) ? "B" : (Marks >=40) ? "C" : "Fail";
        System.out.println(grade);
    }
}
