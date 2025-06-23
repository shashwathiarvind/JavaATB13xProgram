package ex_15_Strings;

public class Lab146_String_Immutable {
    public static void main(String[] args) {
        String name = "Shashwathi"; // this will be in string constant pool
       // name.toUpperCase(); //here output of name will be same as Shashwathi because value is not chnged in JvM
        name = name.toUpperCase(); //SHASHWATHI , here we are assigning new string
        System.out.println(name);

    }

}
