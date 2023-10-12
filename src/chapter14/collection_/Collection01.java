package chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Collection01 {
    public static void main(String[] args) {
        // Collection  单例集合
        // Map  双例集合
        ArrayList al = new ArrayList();
        al.add("jack");
        al.add("tom");
        al.add(10);
        al.add(true);
        System.out.println(al);


        HashMap hm = new HashMap();
        hm.put("name","tom");
        hm.put("age","18");

    }
}
