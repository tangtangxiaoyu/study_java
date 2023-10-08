package chapter13;

public class WrapperVsString {
    public static void main(String[] args) {
        //  Integer => String
        Integer i = 100;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        //  String => Integer
        String s = "12345";
        Integer i2 = Integer.parseInt(s);
        Integer i3 = new Integer(s);
    }
}
