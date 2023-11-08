package chapter17.Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B(a);
        b.start();
    }
}

class A extends Thread{
    private boolean flag = true;
    public void run() {
        while (flag){
            System.out.println("A");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    public void run() {
        while (true) {
            System.out.print("请输入一个值（输入Q退出）：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                System.out.println("用户输入了Q，程序退出。");
                a.setFlag(false);
                break;
            } else {
                System.out.println("您输入的值不是Q，请重新输入。");
            }
        }

    }
}
