package chapter19.outputsteam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String str = "f:\\200.png";
        String str2 = "d:\\255.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(str);
            fileOutputStream = new FileOutputStream(str2,true);
            byte[] buf = new byte[2];
            int readLen = 0;
            while ( (readLen  = fileInputStream.read(buf)) != -1 ){
                fileOutputStream.write(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
