package ex_17_StringBuffer_StringBuilder_StringFunctions;

public class Lab159_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);
        stringBuffer.delete(5,16);
        System.out.println(stringBuffer);
        stringBuffer.replace(0, 4, "C++");
        System.out.println(stringBuffer);
    }
}
