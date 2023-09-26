package chapter12.throws_;

public class customException {
    public static void main(String[] args) {
        int age = 80;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("年龄异常");
        }
        System.out.println("程序正常运行");
    }
}

/**
 *  自定义异常
 *  一般情况下我们自定义异常继承 RuntimeException 好处是可以使用默认的处理机制
 */
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
