package Assignment_Polymorphism;

public class Employee_Role_Info {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Manager();
        Employee e3 = new Clerk();
        Employee e4 = new Tester();

        e1.role();
        e2.role();
        e3.role();
        e4.role();
    }
}
class Employee {
    void role() {
        System.out.println("General Employee");
    }
}

class Manager extends Employee {
    @Override
    void role() {
        System.out.println("Manager will Handles team and  manages them");
    }
}

class Clerk extends Employee {
    @Override
    void role() {
        System.out.println("Clerk handles other tasks");
    }
}

class Tester extends Employee {
    @Override
    void role() {
        System.out.println("Tests software for bugs and issues");
    }
}
