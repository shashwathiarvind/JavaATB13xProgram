package ex_10_For_Loop;

public class Lab123_For_Loop_Even_Odd_From50 {
    public static void main(String[] args) {
        //find even numbers from 1 to 50
        for (int i = 1; i <= 50; i++) { // 1 to 50 Times ie -> 50
         //i%2==0
         if(i%2 == 0)  {
             System.out.println("Even! ->" + i);
         }

        }
    }
}
