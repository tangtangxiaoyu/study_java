package chapter13.StringBuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {

        //1.创建一个大小为16的char[] 用于存放字符串
        StringBuffer stringBuffer = new StringBuffer();

        //2.通过构造器指定char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.通过给一个string创建  char[]大小就是 str.length + 16
        StringBuffer stringBuffer2 = new StringBuffer("abc");

    }
}
