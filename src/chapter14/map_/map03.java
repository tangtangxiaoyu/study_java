package chapter14.map_;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.TreeSet;

public class map03 {
    public static void main(String[] args) {
        // Hashtable hashtable = new Hashtable();
        // hashtable.put(null,"111"); //抛出异常 key和value不能为null
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("a");
        treeSet.add("ab");
        treeSet.add("abc");
        treeSet.add("abcd");

        System.out.println(treeSet);


    }
}
