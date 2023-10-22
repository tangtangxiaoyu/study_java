package chapter15.CustomGeneric;

public class CustomGeneric02 {
    public static void main(String[] args) {

    }
}

/**
 * 1.接口中静态成员不能使用泛型
 * 2.泛型接口的类型  在继承接口或者实现接口时确定
 * 3.没有指定类型  默认是object
 * */

interface IUsb<U,R>{
    int n = 10;
//    U name;  不能这样使用
    R get(U u);  //普通方法中  可以直接使用接口泛型
    void hi(R r);
    void run(R r1,R r2, U u2);
    default R method(U u){
        return null;
    }
}

interface Ia extends IUsb<String,Double>{ }

class AA implements Ia {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u2) {

    }
}
