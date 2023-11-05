package chapter17.threaduse;

public class Thread05 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        Thread.sleep(10000);
        t.setFlag(false);
    }
}

class T extends Thread{
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag; 
    }

    @Override
    public void run() {
        while (flag){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("+++++");
        }
    }
}
