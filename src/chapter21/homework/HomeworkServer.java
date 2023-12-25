package chapter21.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeworkServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待...");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int length = 0;
        String name = "";
        while((length = inputStream.read(buf)) != -1){
            name += new String(buf,0,length);
        }
        System.out.println("要下载的文件名称是" + name);

        String resFileName = "";
        if("201".equals(name)){
            resFileName = "src\\201.png";
        }else{
            resFileName = "src\\qq头像.jpg";
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();

        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

        System.out.println("服务端退出...");
    }
}
