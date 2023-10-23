package chapter15.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void ttt(){
        Dao<User> dao = new Dao<>();
        dao.save("1", new User(1,10,"小明"));
        dao.save("2", new User(2,12,"小红"));
        System.out.println(dao.list());
        System.out.println(dao.get("1"));
        dao.update("2",new User(2,12,"小红111"));
        System.out.println(dao.list());
        dao.delete("2");
        System.out.println(dao.list());
    }
}

class Dao <T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id, T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id, T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        ArrayList<T> ts = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String s: strings){
            ts.add(map.get(s));
        }
        return ts;
    }
    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
