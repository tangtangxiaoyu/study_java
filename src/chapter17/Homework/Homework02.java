package chapter17.Homework;

public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread01 = new Thread(t);
        thread01.setName("t1");
        Thread thread02 = new Thread(t);
        thread02.setName("t2");

        thread01.start();
        thread02.start();

    }
}

class T implements Runnable{
    private int money = 10000;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(money < 1000){
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出1000元 剩余金额" + money);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class t2 extends Thread{
    @Override
    public void run() {

    }
}
