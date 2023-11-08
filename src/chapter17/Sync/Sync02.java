package chapter17.Sync;

public class Sync02 {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo1.start();
        deadLockDemo2.start();
    }
}

/**
 * 死锁现象
 * */
class DeadLockDemo extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}

/**
 * 释放锁
 * 1.当前线程的同步方法  同步代码块执行结束
 * 2.同步方法  同步代码块 遇到 break return
 * 3.同步方法  同步代码块  出现了未处理的error或者exception  导致异常结束
 * 4.同步方法  同步代码块中执行了线程对象的wait（） 方法 当前线程暂停并释放锁
 *
 * 下面操作不会释放锁
 * 1.调用Thread.sleep() Thread.yield()方法  会暂停
 * 2.线程执行同步代码块时  其他线程调用了该线程的suspend方法  会将线程挂起
 * */