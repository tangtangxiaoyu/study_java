package chapter13.StringBuffer_;

import java.util.Scanner;

public class StringBuffer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String inputString = scanner.nextLine();
        StringBuffer sb = new StringBuffer(inputString);
        for(int i = sb.lastIndexOf(".") - 3; i > 0 ; i -= 3 ){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
