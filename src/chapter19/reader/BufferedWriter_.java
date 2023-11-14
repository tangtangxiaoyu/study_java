package chapter19.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String str = "f:\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str,true));
        bufferedWriter.write("hello,我是***1");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,我是***2");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,我是***3");
        bufferedWriter.close();
    }
}
