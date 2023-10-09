package chapter13.StringBuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        /**
         * 1.StringBuffer 的直接父类是 AbstractStringBuilder
         * 2.实现了Serializable  可以串行化
         * 3.在父类AbstractStringBuilder中有属性 char[] value 不是final类型  存放字符串内容  存放在堆中的
         * 4.StringBuffer是final类  不能被继承
         * 5.因为StringBuffer字符内筒是存在 char[] value中的  所以变化不用每次都更换地址
         * */
        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer);
    }
}
