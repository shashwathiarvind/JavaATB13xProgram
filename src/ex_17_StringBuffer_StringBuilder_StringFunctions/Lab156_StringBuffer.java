package ex_17_StringBuffer_StringBuilder_StringFunctions;

public class Lab156_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Shashwathi");
        stringBuffer.append("Arvind");
        System.out.println(stringBuffer);

        //reverse function can be done using stringBuffer.reverse
        System.out.println(stringBuffer.reverse());


    }
}
