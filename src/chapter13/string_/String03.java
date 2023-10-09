package chapter13.string_;

public class String03 {
    public static void main(String[] args) {
        String s1 = "aaa";  //指向池中的aaa
        String s2 = "bbb";  //指向池中的bbb
        String s3 = "aaabbb"; //指向池中的aaabbb
        String s4 = (s1 + s2).intern(); //指向池中的aaabbb
        System.out.println(s3 == s4);  //T
        System.out.println(s3.equals(s4));  //T
    }
}
