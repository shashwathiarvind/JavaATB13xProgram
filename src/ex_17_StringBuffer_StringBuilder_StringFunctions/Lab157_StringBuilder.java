package ex_17_StringBuffer_StringBuilder_StringFunctions;

public class Lab157_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilderr = new StringBuilder("Shashwathi");
        stringBuilderr.append(1906);
        System.out.println(stringBuilderr);

        //reverse function can be done using stringBuffer.reverse
        System.out.println(stringBuilderr.reverse());
    }
}
