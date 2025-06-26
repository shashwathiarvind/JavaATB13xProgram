package ex_19_Strings_Test;

public class String_Comparison_Equality {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello"); // Created using new keyword
        String s4 = "hello";
        String s5 = "World";

        // Using == operator
        System.out.println("--- Using == operator ---");
        System.out.println((s1 == s2)); // true as it is in SCP
        System.out.println( (s1 == s3)); // false

        //  Using equals() method compares content
        System.out.println("--- Using equals() method (compares content, case-sensitive) ---");
        System.out.println( s1.equals(s2));
        System.out.println( s1.equals(s3));
        System.out.println( s1.equals(s4));

        //  Using equalsIgnoreCase() method it compares content, case-insensitive
        System.out.println(" Using equalsIgnoreCase() method (compares content, case-insensitive) ---");
        System.out.println( s1.equalsIgnoreCase(s2)); // true
        System.out.println( s1.equalsIgnoreCase(s4)); // true

        //  Using compareTo() method
        System.out.println("--- Using compareTo() method ---");

        System.out.println( s1.compareTo(s2)); // 0
        System.out.println( s1.compareTo(s5)); // Negative value (H comes before W)
        System.out.println( s5.compareTo(s1)); // Positive value (W comes after H)
    }
}
