package Abstraction_Assignment;

public class Bank_Interest_Calculation {
    public static void main(String[] args) {
        //  SBI object
        Bank sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

        //hdfc object
        Bank hdfc = new HDFC();
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
abstract class Bank {
    abstract double getInterestRate();
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}
class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

