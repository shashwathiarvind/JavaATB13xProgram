package ex_21_OOPS_Constructor;

public class Lab186_Automation_Constructor {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }
}



class WebAutomation {
    //Default Constructor
    WebAutomation() {
        System.out.println("Want to read CSV File");
        System.out.println("Open page before loading scripts");
    }
}
