package chapter15.generic;

import java.util.ArrayList;

public class generic04 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        // 1.错误  必须是引用类型  不能是基本数据类型
        // ArrayList<int> integers2 = new ArrayList<int>();
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());  //2.再给泛型指定具体类型后 可以传入该类型或者其子类型

        ArrayList<Integer> integers2 = new ArrayList<>(); //3.简写后面<>可以去掉

        ArrayList arrayList = new ArrayList();  //4.不写默认是<Object>
        // ArrayList<Object> arrayList = new ArrayList<>();


    }
}

class A {}
class B extends A{}

class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}
