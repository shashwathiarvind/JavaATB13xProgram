package ex_17_StringBuffer_StringBuilder_StringFunctions;

public class Lab158_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
