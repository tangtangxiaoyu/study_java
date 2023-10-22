package chapter15.CustomGeneric;

public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}

/**
 * 1.tiger后面有泛型  所以称tiger为自定泛型类
 * 2.trm是泛型的标识符  一般是单个大写字母
 * 3.泛型的标识符可以是多个
 * 4.普通成员可以使用泛型（属性 方法）
 * 5.使用泛型的数组  不能初始化  T[] ts = new T[8];//错误
 * 6.静态方法 不能使用类的泛型
 * */

class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;
}
