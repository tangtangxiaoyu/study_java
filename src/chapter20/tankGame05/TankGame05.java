package chapter20.tankGame05;

import javax.swing.*;

public class TankGame05 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame05 tankGame05 = new TankGame05();
    }
    public TankGame05(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
