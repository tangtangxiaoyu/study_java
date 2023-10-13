package chapter14.set_;

import java.util.HashSet;

public class set02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("tom");
        hashSet.add("tom");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        hashSet.add(new String("tom"));
        hashSet.add(new String("tom"));
        System.out.println(hashSet);
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog = " + name;
    }
}
