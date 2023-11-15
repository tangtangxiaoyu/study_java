package chapter19.transformation;

import java.io.*;

public class transformation02 {
    public static void main(String[] args) throws IOException {
        String str = "f:\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(str),"gbk");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}
