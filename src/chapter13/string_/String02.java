package chapter13.string_;

public class String02 {
    public static void main(String[] args) {
        String a = "hello";

        String b = "world";

        String c = a + b;

        String d = "helloworld";

        System.out.println(c == d); //F
        /**
         * 1.先创建一个 StringBuilder sb = StringBuilder();
         * 2.执行sb.append hello
         * 3.执行sb.append world
         * 4.String c = sb.toString（）
         * 最后其实是c指向堆中的对象（string） value[] -> 常量池中的 helloworld
         * 执行完毕以后创建了三个对象  a  ->  常量池中的 hello
         * a  ->  常量池中的 hello
         * b  ->  常量池中的 world
         * c  ->  堆
         * 总结： String a = "111" + "222";  常量相加  看的是池  变量相加  是堆
         * */
    }
}
