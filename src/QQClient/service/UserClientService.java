package QQClient.service;

import QQClient.common.Message;
import QQClient.common.MessageType;
import QQClient.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

//完成用户登录验证
public class UserClientService {
    private User u = new User();
    private Socket socket;
    public boolean checkUser(String userId,String pwd){
        u.setUserId(userId);
        u.setPasswd(pwd);
        try {
            socket = new Socket(InetAddress.getByName("127.0.01"),9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message message = (Message) ois.readObject();

            if(message.getMsgType().equals(MessageType.MESSAGE_LOGIN_SUCCESS)){

            }else{

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
