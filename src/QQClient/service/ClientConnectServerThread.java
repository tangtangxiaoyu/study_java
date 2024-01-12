package QQClient.service;

import QQClient.common.Message;
import QQClient.common.MessageType;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread{
    private Socket socket;
    public ClientConnectServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("客户端线程，等待从服务端接受消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if(message.getMsgType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n********在线用户列表*********");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println((i+1) + ".用户:" + onlineUsers[i]);
                    }
                }else{

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Socket getSocket() {
        return socket;
    }
}
