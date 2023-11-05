package chapter17.threaduse;

public class Thread08 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
            if(i == 5){
                T02 t02 = new T02();
                Thread thread = new Thread(t02);
                thread.start();
                thread.join();
                System.out.println("子线程结束");
            }
        }
        System.out.println("主线程结束");
    }
}

class T02 implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


