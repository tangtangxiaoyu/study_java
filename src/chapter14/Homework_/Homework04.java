package chapter14.Homework_;

import java.util.HashSet;
import java.util.Objects;

public class Homework04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Car c1 = new Car(1001,"aa");
        Car c2 = new Car(1002,"bb");

        hashSet.add(c1);
        hashSet.add(c2);

        c1.name = "cc";
        hashSet.remove(c1);

        System.out.println(hashSet);
        hashSet.add(new Car(1001,"cc"));
        System.out.println(hashSet);
        hashSet.add(new Car(1001,"aa"));
        System.out.println(hashSet);

    }
}

class Car{
    public int id;
    public String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
