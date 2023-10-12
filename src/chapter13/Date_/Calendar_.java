package chapter13.Date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        /**
         * 1.是一个抽象类  并且构造器是protected
         * 2.可以通过getInstance获取实例
         * 3.提供大量的方法和字段
         * 4.没有提供格式化方法  需要自己组合
         * */
    }
}
