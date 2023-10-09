package chapter13.string_;

public class String04 {
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        String04 string04 = new String04();
        string04.change(string04.str,string04.ch);
        System.out.println(string04.str + "and");  //hspand
        System.out.println(string04.ch);  //hava
    }
}
