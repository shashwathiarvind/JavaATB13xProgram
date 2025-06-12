package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course_fee = 100;
        float GST = 18.45f;
        //int total = course_fee + GST;//implicit not possible
        int total = course_fee + (int)GST;
        System.out.println(total);
        float total1 = course_fee + GST;//widening implicit
        System.out.println(total1);



    }
}
