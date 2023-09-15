package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws01 {
    public static void main(String[] args) {

    }

    public static void f2(){
        /**
         * 直接调用f1会报错，因为f1抛出一个编译异常，f2必须处理这个异常
         */
        // f1();
    }

    public static void f1() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("d:aa.txt");
    }

    public static void f3(){
        /**
         * 这里可以直接调用f4  因为f4抛出一个运行异常  运行异常是默认有处理的
         */
        f4();
    }
    public static void f4() throws ArithmeticException{
    }
}


/**
 * 子类重写父类方法时  对于抛出的异常  需要和父类型异常一致或者是父类异常的子类
 */

class Father {
    public void method() throws RuntimeException{

    }
}
class Child extends Father{
    public void method() throws NullPointerException{

    }
}
