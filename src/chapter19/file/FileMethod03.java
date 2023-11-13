package chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileMethod03 {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        String fp = "f:\\news1.txt";
        File file = new File(fp);
        if (file.exists()){
            file.delete();
        }
    }

    @Test
    public void m2(){
        String fp = "f:\\ddd";
        File file = new File(fp);
        if (file.exists()){
            file.delete();
        }
    }

    @Test
    public void m3(){
        String fp = "f:\\a\\b\\c";
        File file = new File(fp);
        if (!file.exists()){
            file.mkdirs();
        }
    }
}
