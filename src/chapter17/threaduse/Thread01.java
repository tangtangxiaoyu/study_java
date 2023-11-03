package chapter17.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 创建线程的两种方式
         * 1.继承Thread类  重新run方法
         * 2.实现Runnable接口  重写run方法
         * */
        Cat cat = new Cat();
        cat.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i+"主线程"+ Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

/**
 * 一个类继承了Thread类  该类就可以当成一个线程类
 * */
class Cat extends Thread{
    @Override
    public void run() {
        super.run();
        int times = 0;
        while (true){
            System.out.println("喵喵~"+ times++ + "线程名称" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times == 80){
                break;
            }
        }
    }
}
