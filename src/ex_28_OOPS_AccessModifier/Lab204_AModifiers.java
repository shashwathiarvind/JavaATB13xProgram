package ex_28_OOPS_AccessModifier;

public class Lab204_AModifiers {
}
class Father {
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}
class Son extends Father {
    void weCanuse() {
        System.out.println(car);
        System.out.println(bhk3);
    }
}



