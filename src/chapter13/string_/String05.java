package chapter13.string_;

public class String05 {
    public static void main(String[] args) {
        String str = "abcdef";
        str = reversal(str,1,4);
        System.out.println(str);
    }
    public static String reversal(String str, int start, int end){
        char[] cArr = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = cArr[i];
            cArr[i] = cArr[j];
            cArr[j] = temp;
        }
        return new String(cArr);
    }

    //f f
}
