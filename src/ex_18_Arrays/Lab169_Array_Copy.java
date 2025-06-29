package ex_18_Arrays;

public class Lab169_Array_Copy {

    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original,  0,  copy,  0, original.length);
    }
}
