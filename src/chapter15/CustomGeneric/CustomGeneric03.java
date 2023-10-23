package chapter15.CustomGeneric;

import java.util.ArrayList;

public class CustomGeneric03 {
    public static void main(String[] args) {
        Car car = new Car();
        // car.fly("aaa",10);

        Fish<String, ArrayList> arr = new Fish<>();
        arr.hi("hello");
        arr.ok(new ArrayList(),5);
    }
}


//泛型方法可以定义在普通类中
class Car{
    //普通方法
    public void run(){}
    public<T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

//泛型类
class Fish<T,R>{
    // 泛型方法
    public<U,M> void eat(U u,M m){}
    public void hi(T t){}
    // hi方法不是泛型方法 是hi方法使用了类声明的泛型
    public<K> void ok(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
    //泛型方法 可以使用类声明的泛型  也可以使用自己声明泛型
}
