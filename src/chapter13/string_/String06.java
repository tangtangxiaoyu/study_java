package chapter13.string_;

public class String06 {
    public static void main(String[] args) {
        String s1 = "abcd";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);  // f
        System.out.println(a.equals(b));  // f
        System.out.println(a.name == b.name);  //t

        String s4 = new String("abcd");
        String s5 = "abcd";

        System.out.println(s1 == s4);  // f
        System.out.println(s4 == s5);  // f

        String t1 = "hello" + s1;
        String t2 = "helloabcd";
        System.out.println(t1.intern() == t2); //t

    }
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
