package chapter14.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collections01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ant_fu");
        list.add("jack");
        list.add("tom");
        System.out.println(list);
        Collections.reverse(list);  //反转
        Collections.shuffle(list);  //随机排序
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2){
                return ((String)o1).length() - ((String)o2).length();
            }
        });  //new Comparator
        System.out.println(list);
        Collections.swap(list,0,1);//指定位置交换
        System.out.println(list);
    }
}
