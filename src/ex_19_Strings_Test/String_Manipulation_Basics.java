package ex_19_Strings_Test;

public class String_Manipulation_Basics {
    public static void main(String[] args) {
String s1 = "Hello";
String s2 = "World";
//string concat
        System.out.println(s1.concat(s2));
        System.out.println(s2.concat(s1));
        //string length
        System.out.println(s1.length());
        //to find substring
        System.out.println(s1.substring(0, 2));
        System.out.println(s2.substring(1, 3));
        //to find character extraction
        char firstChar = s1.charAt(0);
        System.out.println(firstChar);
    }
}
