package ex_15_Strings;

public class Lab152_String_Interview_Advanced {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";//SCP->1 string is present

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");//Object area has 3 strings
        //SCP/OA
        //1/ 3 -> 4 strings
        //Comparision -> String -> this woll check location
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
// equals (will check content of strings
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s5)); //false as case sensitivity, in lowercase

        //to ignore case sensitivity use
        System.out.println(s3.equalsIgnoreCase(s5));

    }
}
