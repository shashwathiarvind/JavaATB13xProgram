package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a = 300;
        //byte b = a; // narrowing (int to byte) which is not allowed
        byte b = (byte)a; // narrowing int ->byte -explicit mention
        System.out.println(b);

    }
}
