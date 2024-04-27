package chapter21.udp;

import java.io.IOException;
import java.net.*;

public class udpB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] buf = "hello".getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.5"),9999);
        socket.send(packet);

        buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        System.out.println("等待数据...");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
    }
}

