package chapter19.reader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

        String str = "f:\\1.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(str);
            while ( (data = fileReader.read()) != -1 ){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if( fileReader != null ){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void mmm(){
        String str = "f:\\1.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[88];
        try {
            fileReader = new FileReader(str);
            while ( (readLen = fileReader.read(buf)) != -1 ){
                System.out.print(new String(buf, 0 , readLen ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if( fileReader != null ){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
