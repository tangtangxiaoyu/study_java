package chapter20.tankGame05;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{

    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    Vector<EnemyTank> enemyTanks = new Vector<>();

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //判断是否碰撞其他坦克
    public boolean isTouch(){
        switch (getDirect()){
            case 0://上
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if(enemyTank != this){
                        if(enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 40 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            if(getX() + 40 >= enemyTank.getX() && getX() + 40 <= enemyTank.getX() + 40 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                        }
                        if(enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 60 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            if(getX() + 40 >= enemyTank.getX() && getX() + 40 <= enemyTank.getX() + 60 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1://右
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if(enemyTank != this){
                        if(enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2){
                            if(getX() + 60 >= enemyTank.getX() && getX() + 60 <= enemyTank.getX() + 40 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            if(getX() + 60 >= enemyTank.getX() && getX() + 60 <= enemyTank.getX() + 40 && getY() + 40 >= enemyTank.getY() && getY() + 40 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }
                        if(enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3){
                            if(getX()  + 60 >= enemyTank.getX() && getX() + 60 <= enemyTank.getX() + 60 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            if(getX() + 60 >= enemyTank.getX() && getX() + 60 <= enemyTank.getX() + 60 && getY() + 40 >= enemyTank.getY() && getY() + 40 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2://下
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if(enemyTank != this){
                        if(enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 40 && getY() + 60 >= enemyTank.getY() && getY() + 60 <= enemyTank.getY() + 60){
                                return true;
                            }
                            if(getX() + 40 >= enemyTank.getX() && getX() + 40 <= enemyTank.getX() + 40 && getY() + 60 >= enemyTank.getY() && getY() + 60 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }
                        if(enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 60 && getY() + 60 >= enemyTank.getY() && getY() + 60 <= enemyTank.getY() + 40){
                                return true;
                            }
                            if(getX() + 40 >= enemyTank.getX() && getX() + 40 <= enemyTank.getX() + 60 && getY() + 60 >= enemyTank.getY() && getY() + 60 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3://左
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if(enemyTank != this){
                        if(enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 40 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 60){
                                return true;
                            }
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 40 && getY() + 40 >= enemyTank.getY() && getY() + 40 <= enemyTank.getY() + 60){
                                return true;
                            }
                        }
                        if(enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3){
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 60 && getY() >= enemyTank.getY() && getY() <= enemyTank.getY() + 40){
                                return true;
                            }
                            if(getX() >= enemyTank.getX() && getX() <= enemyTank.getX() + 60 && getY() + 40 >= enemyTank.getY() && getY() + 40 <= enemyTank.getY() + 40){
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while (true){
            if(isLive && shots.size() == 0){
                Shot s = null;
                switch (getDirect()){
                    case 0:
                        s = new Shot(getX() + 20,getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60,getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20,getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(),getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            switch (getDirect()){
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if(getY() > 0 && !isTouch()){
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if(getX() + 60 < 1000 && !isTouch()){
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if(getY() + 60 < 750 && !isTouch()){
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if(getX() > 0 && !isTouch()){
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            setDirect((int)(Math.random()*4));
            if(!isLive){
                break;
            }
        }
    }
}
