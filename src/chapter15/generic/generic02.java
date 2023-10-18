package chapter15.generic;

import java.util.*;

public class generic02 {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<Person>();
        arr.add(new Person("xiaoming1",20));
        arr.add(new Person("xiaoming2",22));

        for (Person p: arr){
            System.out.println(p);
        }

        HashMap<String,Person> hashMap = new HashMap<String,Person>();
        hashMap.put("1",new Person("1",1));
        hashMap.put("2",new Person("2",1));

        Set<Map.Entry<String, Person>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Person>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
