package chapter14.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collections02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ant_fu");
        list.add("jack");
        list.add("tom");

        Object maxObject = Collections.max(list, new Comparator() {
            public int compare(Object o1,Object o2){
                return  ((String)o2).length() - ((String)o1).length();
            }
        });
        List list2 = new ArrayList();
        //拷贝的话  size要一样
        for (int i = 0; i < 3; i++) {
            list2.add("");
        }
        Collections.copy(list2,list);
        System.out.println(list2);
    }
}
