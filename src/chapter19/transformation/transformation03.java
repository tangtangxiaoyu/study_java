package chapter19.transformation;

import java.io.*;

public class transformation03 {
    public static void main(String[] args) throws IOException {
        String str = "f:\\c.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(str), "utf8");
        osw.write("hi,真择优");
        osw.close();
    }
}
