package chapter17.threaduse;

public class Thread09 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果我们希望主线程结束以后  子线程自动结束  需要把子线程设置成守护线程就可以
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("宝强正在辛苦的工作..." + i);
            Thread.sleep(1000);
        }
        System.out.println("宝强回家了,打开了卧室门，发现...");
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("马蓉宋哲正在偷偷...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}