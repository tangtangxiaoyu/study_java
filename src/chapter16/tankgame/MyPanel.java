package chapter16.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);  //初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    /**
     * xy坦克左上角坐标
     * g 画笔
     * direct 方向 上下左右
     * type坦克类型
     * */
    public void drawTank(int x,int y, Graphics g,int direct,int type){
        switch (type){
            case 0://我们的坦克
            g.setColor(Color.cyan);
            break;
            case 1://敌人坦克
            g.setColor(Color.yellow);
            break;
        }

        switch (direct){
            case 0://我们的坦克
                g.fill3DRect(x, y, 10, 60, false);//左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间驾驶舱
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
                break;
        }

    }
}
