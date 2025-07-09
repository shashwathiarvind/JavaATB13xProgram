package ex_35_Exceptions;

public class Lab227_Throws {
    public static void main(String[] args) {

    }
    static void divideByZero(int a ){
        if(a ==0){
            throw new ArithmeticException("Error a == 0");
        }
    }
}
