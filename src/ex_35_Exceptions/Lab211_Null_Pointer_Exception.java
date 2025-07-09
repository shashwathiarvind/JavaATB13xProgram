package ex_35_Exceptions;

public class Lab211_Null_Pointer_Exception {
        public static void main(String[] args) {
            String name= null; // java.lang.NullPointerException
            name.trim(); //null cant be trimmed

        }
    }

