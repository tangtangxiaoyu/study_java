package chapter17.Sync;

public class Sync01 {
    public static void main(String[] args) {
//        SellTicket01 sellTicket1 = new SellTicket01();
//        SellTicket01 sellTicket2 = new SellTicket01();
//        SellTicket01 sellTicket3 = new SellTicket01();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();

        SellTicket03 sell03 = new SellTicket03();
        new Thread(sell03).start();
        new Thread(sell03).start();
        new Thread(sell03).start();

    }
}


/**
 * 内容解读
 * 1.引入对象互斥锁的概念，来保证共享数据操作的完整性
 * 2.每个对象都对应于一个可称为“互斥锁”的标记  这个标记用来保证在任何时刻  只有一个线程可以访问该对象
 * 3.关键字synchronized来与对象的互斥锁联系  当某个对象用synchronized修饰的时  表明该对象在任意时刻只能有一个线程访问
 * 4.同步的局限性  导致程序的执行效率要降低
 * 5.同步方法（非静态）的锁可以是this  也可以是其他对象（要求是同一个对象）
 * 6.同步方法（静态）的锁为当前类本身
 * */

class SellTicket03 implements Runnable{
    private int number = 100;
    private boolean loop = true;
    @Override
    public void run() { //同步方法  在同一个时刻  只能有一个线程来操作run方法
        while (loop){
            sell();
        }
    }

    // 6.同步方法（静态）的锁为当前类本身
    public synchronized static void mmm(){

    }
    public static void mmm2(){
        synchronized (SellTicket03.class){

        }
    }

    public void sell(){
//    public synchronized void sell(){
        synchronized(this){
            if(number <= 0){
                System.out.println("***结束***");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "窗口卖出一张票 剩余票数" + (--number));
        }
    }
}

class SellTicket01 extends Thread{
    private static int number = 100;
    @Override
    public void run() {
        while (true){
            if(number <= 0){
                System.out.println("***结束***");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + "窗口卖出一张票 剩余票数" + (--number));
        }
    }
}

class SellTicket02 implements Runnable{
    private int number = 100;
    @Override
    public void run() {
        while (true){
            if(number <= 0){
                System.out.println("***结束***");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + "窗口卖出一张票 剩余票数" + (--number));
        }
    }
}

