package chapter14.map_;

import java.util.Hashtable;

public class map03 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,"111"); //抛出异常 key和value不能为null

    }
}
