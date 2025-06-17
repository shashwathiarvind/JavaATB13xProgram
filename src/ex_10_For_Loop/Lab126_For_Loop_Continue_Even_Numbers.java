package ex_10_For_Loop;

public class Lab126_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++)    {  //0 to 50 ie 51 times
            if(i%2==0)         {
                //System.out.println("Even ->" + i);
                continue; //means skipping
            }
            System.out.println("Odd ->" +i);  //prints only odd numbers as for even we used continue

        }
    }
}
