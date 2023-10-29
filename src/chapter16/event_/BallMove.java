package chapter16.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,400);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override  //有字符输出
    public void keyTyped(KeyEvent e) {

    }

    @Override  //当某个键按下  会触发
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y++;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
        }
        this.repaint();
    }

    @Override  //当某个键松开  会触发
    public void keyReleased(KeyEvent e) {

    }
}
