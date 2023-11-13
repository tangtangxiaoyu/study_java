package chapter19.outputsteam;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteam01 {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        String fp = "f:\\a.txt";
        FileOutputStream fileOutputStream = null;


        /**
         * new FileOutputStream(fp)  会覆盖之前的内容
         * new FileOutputStream(fp， true)  会在末尾追加
         * */

        try {
            fileOutputStream = new FileOutputStream(fp,true);
            // fileOutputStream.write('a');
            fileOutputStream.write("1111".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
