package chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List ls = new ArrayList();
        for (int i = 0; i < 10; i++) {
            ls.add("hello"+i);
        }
        ls.add(1,"ppp");
        System.out.println(ls);
        System.out.println(ls.get(4));
        ls.set(7,"666");
        System.out.println(ls);
        Iterator iterator = ls.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
