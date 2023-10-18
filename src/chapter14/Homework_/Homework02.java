package chapter14.Homework_;

import java.util.HashMap;
import java.util.Set;

public class Homework02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("tom",3500);
        map.put("jack",4500);
        map.put("smith",5500);
        System.out.println(map);

        Set set = map.keySet();
        for(Object key: set){
            map.put(key, (Integer)map.get(key) + 100);
        }
        System.out.println(map);
    }
}
