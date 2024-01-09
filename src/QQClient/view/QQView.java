package QQClient.view;

import QQClient.utils.Utility;

public class QQView {
    private boolean loop = true;
    private String key = "";

    public static void main(String[] args) {
        new QQView().mainView();
        System.out.println("客户端退出系统");
    }

    private void mainView(){
        while (loop){
            System.out.println("==================欢迎登录=====================");
            System.out.println("\t\t1.登录系统");
            System.out.println("\t\t9.退出系统");
            System.out.println("请输入您的选择");

            key = Utility.readString(1);
            switch (key){
                case "1":
                    System.out.println("请输入用户名:");
                    String userId = Utility.readString(50);
                    System.out.println("请输入秘密:");
                    String pwd = Utility.readString(50);
                    if(true){
                        System.out.println("==================欢迎"+ userId +"=====================");
                        while (loop){
                            System.out.println("\n==============二级菜单"+ userId +"=====================");
                            System.out.println("\t\t1.显示在线用户列表");
                            System.out.println("\t\t2.群发消息");
                            System.out.println("\t\t3.私聊消息");
                            System.out.println("\t\t4.发送文件");
                            System.out.println("\t\t9.退出系统");
                            System.out.print("请输入您的选择");
                            key = Utility.readString(1);
                            switch (key){
                                case "1":
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }
                        }
                    }else{
                        System.out.println("登录失败");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }

        }
    }
}
