package chapter17.threaduse;

public class Thread04 {
    public static void main(String[] args) {
//        SellTicket01 sellTicket1 = new SellTicket01();
//        SellTicket01 sellTicket2 = new SellTicket01();
//        SellTicket01 sellTicket3 = new SellTicket01();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
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
