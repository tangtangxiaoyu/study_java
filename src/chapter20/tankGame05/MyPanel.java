package chapter20.tankGame05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(){
        hero = new Hero(800,100);  //初始化自己坦克
        hero.setSpeed(10);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX()+20,enemyTank.getY()+60,enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        if(hero != null && hero.isLive){
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        }
//        if(hero.shot != null && hero.shot.isLive){
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1,false);
//        }
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if(shot != null && shot.isLive){
                g.draw3DRect(shot.x, shot.y, 1, 1,false);
            }else{
                hero.shots.remove(shot);
            }
        }

        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6){
                g.drawImage(image1,bomb.x,bomb.y, 60, 60, this);
            } else if(bomb.life > 3){
                g.drawImage(image2,bomb.x,bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3,bomb.x,bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            if(bomb.life == 0){
                bombs.remove(bomb);
            }
        }

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if(enemyTank.isLive){
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if(shot.isLive){
                        g.draw3DRect(shot.x, shot.y, 1, 1,false);
                    }else{
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
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


        //direct 0上 1右 2下 3左
        switch (direct){
            case 0://我们的坦克
                g.fill3DRect(x, y, 10, 60, false);//左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//中间驾驶舱
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
                break;
            case 1://我们的坦克
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x ,y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://我们的坦克
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://我们的坦克
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x ,y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
        }
    }

    public void hitHero(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if(hero.isLive && shot.isLive){
                    hitTank(shot, hero);
                }
            }
        }
    }

    public void hitEnemyTank(){
        for (int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);

            if(shot != null && shot.isLive){
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot,enemyTank);
                }
            }
        }
        hitHero();
    }

    //判断是否击中
    public void hitTank(Shot s, Tank enemyTank){
        switch (enemyTank.getDirect()){
            case 0:
            case 2:
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60){
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if(s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40){
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_W){
            hero.setDirect(0);
            if(hero.getY() > 0){
                hero.moveUp();
            }
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            hero.setDirect(1);
            if(hero.getX() + 60 < 1000){
                hero.moveRight();
            }
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            hero.setDirect(2);
            if(hero.getY() + 60 < 750){
                hero.moveDown();
            }
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            hero.setDirect(3);
            if(hero.getX() > 0){
                hero.moveLeft();
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_J){
//            if(hero.shot == null || !hero.shot.isLive){
//                hero.shotEnemyTank();
//            }
            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hitEnemyTank();
            this.repaint();
        }
    }
}
