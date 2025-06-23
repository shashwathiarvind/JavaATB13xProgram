package ex_15_Strings;

public class Lab154_String_Functions {
    public static void main(String[] args) {


        String  name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

        System.out.println(name.concat("Patel"));
         // contains -> checks if om is present in string
        System.out.println(name.contains("om"));
        //equals-> checks content
        System.out.println(name.equals("Sonal"));
         //ignorecase
        System.out.println(name.equalsIgnoreCase("sonal"));
         //index of -> sonal-> o is 1
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        //return the index within this string of
        //first occurance of specified substring
        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));

        //length
        System.out.println(name.length());

        //replace->sonal->replace ->soNal
        System.out.println(name.replace('n' , 'N'));

        //split()
        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println((split_name4[0]));
        System.out.println((split_name4[1]));
        System.out.println((split_name4[2]));
    }
}
