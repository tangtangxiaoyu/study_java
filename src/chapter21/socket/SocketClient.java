package chapter21.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("12212".getBytes());
        outputStream.close();
        socket.close();
        System.out.println("客户端已关闭");
    }
}
