package criminal;

import police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
        //thief.canIShoot(); cant access as it is protected
    }
}
