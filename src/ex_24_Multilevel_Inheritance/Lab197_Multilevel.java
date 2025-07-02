package ex_24_Multilevel_Inheritance;

public class Lab197_Multilevel {
    public static void main(String[] args) {


        Son abc= new Son();
        System.out.println(abc.gold_gf);
        abc.gf();

        GrandFather grandFather = new Son();
        grandFather.home();

    }
}






