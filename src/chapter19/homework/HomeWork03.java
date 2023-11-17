package chapter19.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\chapter19\\dog.properties"));
        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.get("age") + "");
        System.out.println(name + "小狗" + age + "岁了");

        Dog dog = new Dog(name, age);
        System.out.println(dog);

        String fp = "f:\\dog.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fp));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
    }

    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String str2 = "f:\\dog.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(str2));

        Object o = ois.readObject();
        Dog o2 = (Dog)o;
        System.out.println("-----");
        System.out.println(o2);
        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
