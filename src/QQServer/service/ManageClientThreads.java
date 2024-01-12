package QQServer.service;

import java.util.HashMap;
import java.util.Iterator;

public class ManageClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    public static void addClientThread(String userId,ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId,serverConnectClientThread);
    }

    public static ServerConnectClientThread getClientThread(String userId) {
        return hm.get(userId);
    }

    public static String getOnlineUser(){
        Iterator<String> iterator = hm.keySet().iterator();
        String str = "";
        while (iterator.hasNext()){
            str += iterator.next().toString() + " ";
        }
        return str;
    }
}
