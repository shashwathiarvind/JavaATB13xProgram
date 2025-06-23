package ex_15_Strings;

public class Lab148_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        //s1.concat("world");
        // if we give only this statement thn it wont concat , we should assign
        s1 = s1.concat("world");
        System.out.println(s1);
    }
}
