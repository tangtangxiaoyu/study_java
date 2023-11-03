package chapter17.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("wang~" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
