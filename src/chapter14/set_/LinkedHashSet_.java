package chapter14.set_;

import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new String("Aa"));
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add("123");
        System.out.println(linkedHashSet);
    }
}
