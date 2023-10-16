package chapter14.map_;

import java.util.HashMap;

public class map01 {
    public static void main(String[] args) {
        /**
         * 1.保存具有映射关系的数据
         * 2.可以是任何类型的数据  会封装到HashMap$node 对象中
         * 3.当key相同时  会替换
         * 4.key和value都可以为null  key为null只能有一个
         * 5.常用string作为key
         * */

        HashMap hashMap = new HashMap();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key1","value1");
        System.out.println(hashMap.get("key1"));
        System.out.println(hashMap);
    }
}
