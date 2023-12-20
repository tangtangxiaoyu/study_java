package chapter21.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class uploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在监听8888....");
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\201.png"));
        bos.write(bytes);
        bos.close();


        // 向客服端恢复  收到图片
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();
        socket.shutdownOutput();

        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
