package QQClient.service;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    // 我们把多个线程放入hashmap中  key就是用户id
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }

    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
