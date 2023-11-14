package chapter19.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String str = "f:\\a.txt";
        FileWriter fileWriter = null;
        char[] chars = { 'a','b','c'};
        try {
            fileWriter = new FileWriter(str);
            // fileWriter.write('H');
            // fileWriter.write(chars);
            // fileWriter.write("123456".toCharArray(),0,3);
            // fileWriter.write("123465");
            fileWriter.write("123465",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
