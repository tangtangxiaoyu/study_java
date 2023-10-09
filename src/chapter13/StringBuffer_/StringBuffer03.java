package chapter13.StringBuffer_;

public class StringBuffer03 {
    public static void main(String[] args) {
        // String ==> StringBuffer
        String str = "hello";
        //方式1  返回的是StringBuffer  对本身的str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2  使用stringBuffer的append方法拼接
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        // StringBuffer ==> String
        StringBuffer stringBuffer2 = new StringBuffer("abc");
        //方式1
        String s1 = stringBuffer2.toString();
        //方式2
        String s2 = new String(stringBuffer2);

    }
}
