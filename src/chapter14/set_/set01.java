package chapter14.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set01 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("a111");
        s.add("b222");
        s.add("c333");
        s.add("a666");

        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }

        System.out.println("------");

        for(Object o : s){
            System.out.println(o);
        }


    }
}
