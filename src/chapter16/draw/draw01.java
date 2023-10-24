package chapter16.draw;

import javax.swing.*;
import java.awt.*;

public class draw01 extends JFrame {//窗口
    private MyPanel mp = null;
    public static void main(String[] args) {
        new draw01();
    }
    public draw01(){
        mp = new MyPanel();  //初始化面板
        this.add(mp);
        this.setSize(550,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
// 先定义一个MyPanel  继承 JPanel  在面板上画
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//绘图方法  相当于画笔
        super.paint(g);

        //画圆
        // g.drawOval(8,10,180,180);

        //画直线
        // g.drawLine(5,5,180,5);

        //矩形
        // g.drawRect(10,10,180,180);

        //填充矩形
        // g.setColor(Color.BLUE);
        // g.fillRect(10,10,180,180);

        //画图片
        // Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/01.png"));
        // g.drawImage(image,0,0,150,150, this);

        g.setColor(Color.RED);
        g.setFont(new Font("宋体", Font.BOLD, 50));
        g.drawString("北京你好",100,100);

    }
    /**
     * 以下情况会调用paint方法
     * 当组件第一次显示的时候  会自动调用paint方法
     * 窗口最小胡  再最大化
     * 窗口大小发生变化
     * repaint函数被调用
     * */
}
