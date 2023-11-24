package chapter21.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class api_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);  //LAPTOP-FGG8J0G4/192.168.31.187

        InetAddress host1 = InetAddress.getByName("LAPTOP-FGG8J0G4");
        System.out.println(host1);

        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);
        System.out.println(host2.getHostAddress());
        System.out.println(host2.getHostName());
    }
}
