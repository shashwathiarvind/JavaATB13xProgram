package ex_18_Arrays;

public class Lab160_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = { 91,90,51,100,91,92,89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]); // here 1 will take 2nd index tat is 90
        System.out.println(marks[10]);//gives exception as array index out of bound
    }

}
