package chapter13;

public class WrapperVsString {
    public static void main(String[] args) {
        Integer i = 100;

        //方式1
        String str1 = i + "";

        //方式2
        String str2 = i.toString();

        //方式3
        String str3 = String.valueOf(i);



    }
}
