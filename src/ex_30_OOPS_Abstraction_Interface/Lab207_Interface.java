package ex_30_OOPS_Abstraction_Interface;

public class Lab207_Interface {
    Rectangle r1 = new Rectangle();
   // r1.getArea(10, 10);
}
class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println(length * breadth);

    }
}


class Square implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of a square->" +3.14 * length * breadth);
    }
}
interface Polygon {
    void getArea(int length, int breadth);


    default void complete() {
        System.out.println("this is possible");
    }
    default void complete2() {
        System.out.println("this is possible2");
    }
    static void staticComplete() {
        System.out.println("Static F1 in interface allowed complete");
    }
}
abstract class A {     //just to show v can use complete function in asbstact class we have used this function
    abstract void m1();
    void complete() {
        System.out.println("complete");
    }
}
