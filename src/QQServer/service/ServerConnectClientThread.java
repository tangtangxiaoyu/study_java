package QQServer.service;

import QQClient.common.Message;
import QQClient.common.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("服务端和客服端保持通讯  读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if(message.getMsgType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                    System.out.println(message.getSender() + "请求获取在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    Message message1 = new Message();
                    message1.setMsgType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
                    message1.setContent(onlineUser);
                    message1.setSender(message.getSender());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message1);
                }else{

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
