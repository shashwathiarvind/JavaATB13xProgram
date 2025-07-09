package ex_35_Exceptions;

public class Lab215_Try_Interview {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");
        }catch (Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");
    }
}

