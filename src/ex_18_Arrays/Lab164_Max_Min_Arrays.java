package ex_18_Arrays;

public class Lab164_Max_Min_Arrays {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //Arrays.sort(array);
        //System.out.println(array[array.length-1]);// this is not correct way instead create a method

        int max_output = give_me_max(array);
        System.out.println(max_output);
    }

    static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
}
