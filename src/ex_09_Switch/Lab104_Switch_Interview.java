package ex_09_Switch;

public class Lab104_Switch_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {   //ch is also integer soo can use char in switch
            case  65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");

        }
    }
}