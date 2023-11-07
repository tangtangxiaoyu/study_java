package chapter17.Threaduse;

public class Thread06 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.setName("666");
        a.setPriority(Thread.MIN_PRIORITY);  //设置优先级
        a.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
        }
        System.out.println(a.getPriority());//获取优先级
        a.interrupt(); //中断休眠
    }
}

class A extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠了");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "中断了");
            }
        }
    }
}