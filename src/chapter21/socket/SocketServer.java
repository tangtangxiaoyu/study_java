package chapter21.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端执行监听....");
        Socket accept = serverSocket.accept();
        System.out.println(accept.getClass());
        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLine));
        }

        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
