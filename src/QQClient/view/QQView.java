package QQClient.view;

import QQClient.utils.Utility;

public class QQView {
    private boolean loop = true;
    private String key = "";

    public static void main(String[] args) {
        new QQView().mainView();
    }

    private void mainView(){
        while (loop){
            System.out.println("==================欢迎登录=====================");
            System.out.println("\t\t1.登录系统");
            System.out.println("\t\t9.退出系统");

            key = Utility.readString(1);
            switch (key){
                case "1":
                    System.out.println("登录系统");
                    break;
                case "9":
                    loop = false;
                    break;
            }

        }
    }
}
