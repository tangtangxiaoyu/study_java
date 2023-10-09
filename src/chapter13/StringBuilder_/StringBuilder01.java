package chapter13.StringBuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        /**
         * StringBuilder父类AbstractStringBuilder
         * 实现了Serializable  可以串行化
         * StringBuilder是final类  不能被继承
         * 在父类AbstractStringBuilder中有属性 char[] value 不是final类型  存放字符串内容  存放在堆中的
         * StringBuilder的方法没有做互斥的处理  在单线程的情况下使用StringBuilder
         * */
    }
}
