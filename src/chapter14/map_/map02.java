package chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");


        //2种
        Set set = hashMap.keySet();
        for (Object key : set){
            System.out.println(key);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        //2种 省略  hashMap.values()
        System.out.println("********");
        Set set1 = hashMap.entrySet();
        for (Object entry: set1){
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey());
        }

    }
}
