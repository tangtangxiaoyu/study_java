package chapter17.ThreadState;

public class ThreadState01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getState() + "1");
        t.start();
        while (Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getState() + "2");
            Thread.sleep(1000);
        }
        System.out.println(t.getState() + "3");
    }
}

class T extends Thread{
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
