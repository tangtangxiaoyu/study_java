package chapter15.generic;

public class generic02 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>;

    }
}

class Person<E>{
    public E e;

    public Person(E e) {
        this.e = e;
    }
}
