package ex_21_OOPS_Constructor;

public class Lab190_Parameterized_Constructor_Real {
    public static void main(String[] args) {
        Person p1 = new Person("Shashwathi",9620323,"abc");
        System.out.println(p1.name);
        Person p2 = new Person("Arvind",98989898,"XYZ");
        System.out.println(p2.phone);
//        Person p3  = new Person();
//        p3.name  = "Smita";
//        System.out.println(p3.name);




    }
}


class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;

    }
    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;

    }




}



