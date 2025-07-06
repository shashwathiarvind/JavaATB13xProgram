package police;

public class Cop {

    public int gun;
    String idCard;


    public Cop(int bullet) {
        this.gun =bullet;
    }
    protected void canIShoot() {
        System.out.println("Yes you can");
    }
}
