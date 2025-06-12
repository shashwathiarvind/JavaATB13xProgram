package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
       //example for storing phone number, as phone no has 10 digits it shld be stored in long
        long phone = 9620323912l;
        short s = (short)phone; //explicit narrow
        System.out.println(s);


    }
}
