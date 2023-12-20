package chapter21.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class uploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("f:\\200.png"));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);

        bis.close();
        socket.shutdownOutput();  //设置写入数据的结束标记


        //接受服务端消息
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关闭流
        inputStream.close();
        bos.close();
        socket.close();

    }
}
