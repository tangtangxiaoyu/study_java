package chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileMethod01 {
    public static void main(String[] args) {
        // 创建文件  三种方式

    }

    @Test
    public void c01(){
        String fp = "f:\\news1.txt";
        File file = new File(fp);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void c02(){
        File fileParent = new File("f:\\");
        String fn = "new2.txt";
        File file = new File(fileParent, fn);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void c03(){
        String fp1 = "f:\\";
        String fp2 = "new3.txt";
        File file = new File(fp1 , fp2);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
