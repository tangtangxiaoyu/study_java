package QQServer.service;

import QQClient.common.Message;
import QQClient.common.MessageType;
import QQClient.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class QQServer {
    private ServerSocket ss = null;
    private static HashMap<String,User> validUsers = new HashMap<>();

    static {
        validUsers.put("100",new User("100","123456"));
        validUsers.put("200",new User("200","123456"));
        validUsers.put("300",new User("300","123456"));
        validUsers.put("至尊宝",new User("至尊宝","123456"));
        validUsers.put("紫霞仙子",new User("紫霞仙子","123456"));
        validUsers.put("菩提老祖",new User("菩提老祖","123456"));
    }

    public boolean checkUser(String userId,String pwd){
        User user = validUsers.get(userId);
        if(user == null){
            return false;
        }
        if(!user.getPasswd().equals(pwd)){
            return false;
        }
        return true;
    }

    public QQServer(){
        System.out.println("服务端正在监听9999...");
        try {
            ss = new ServerSocket(9999);
            while (true){
                Socket socket = ss.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();
                Message message = new Message();
                if(checkUser(u.getUserId(),u.getPasswd())){
                    System.out.println(u.getUserId()+"用户已连接");
                    message.setMsgType(MessageType.MESSAGE_LOGIN_SUCCESS);
                    oos.writeObject(message);
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserId());
                    serverConnectClientThread.start();
                    ManageClientThreads.addClientThread(u.getUserId(),serverConnectClientThread);
                }else{
                    message.setMsgType(MessageType.MESSAGE_LOGIN_FILL);
                    oos.writeObject(message);
                    socket.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
