package chapter17.Threaduse;

public class Thread07 {
    public static void main(String[] args) throws InterruptedException {
        T01 t01 = new T01();
        t01.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程" + i);
            if( i == 5 ){
                System.out.println("插队");
                // t01.join();
                Thread.yield();
                System.out.println("插队结束");
            }
        }
    }
}

class T01 extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程" + i);

        }
    }
}


