package chapter19.reader;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String str1 = "f:\\a.gif";
        String str2 = "d:\\d.gif";
        BufferedInputStream fi = null;
        BufferedOutputStream fo = null;

        try {
            fi = new BufferedInputStream(new FileInputStream(str1));
            fo = new BufferedOutputStream(new FileOutputStream(str2));
            byte[] buff = new byte[1024];
            int readLine = 0;
            while ((readLine = fi.read(buff)) != -1){
                fo.write(buff, 0 , readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fi != null){
                    fi.close();
                }
                if(fo != null){
                    fo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
