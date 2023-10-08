package chapter13.string_;

public class String01 {
    public static void main(String[] args) {
        /*
        * 1.用于保存字符串  也就是一组字符序列
        * 2."jack" 是字符串常量
        * 3.字符串的字符使用unicode编码  一个字符两个字节
        * 4.String有很多构造器
        * 5.String类实现了串行化接口  可以在网络传输  实现了比较接口  可以比较大小
        * 6.他是final类  不能被其他类继承
        * 7.private final char value[]; 用于存放字符串内容
        * 8.value是一个final类型  不可以修改
        * */
        String name = "jack";
        String name2 = new String("jack");

        System.out.println(name.equals(name2));//T

        System.out.println(name == name2);//F

        System.out.println(name == name2.intern()); //T

        System.out.println(name2 == name2.intern()); //F

        Person p1 = new Person();
        p1.name = "1";

        Person p2 = new Person();
        p2.name = "1";

        System.out.println(p1.name.equals(p2.name)); //T
        System.out.println(p1.name == p2.name); //
        System.out.println(p1.name == "1");

    }
    
    static class Person{
        public String name;
    }
}
