package chapter19.inputsteam;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSteam01 {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01(){
        int read = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建fileInputStream对象 用于读文件
            fileInputStream = new FileInputStream("f:\\new.txt");
            while ((read = fileInputStream.read()) != -1){
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile02(){
        int read = 0;
        byte[] bbb = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            //创建fileInputStream对象 用于读文件
            fileInputStream = new FileInputStream("f:\\new.txt");
            while (( read = fileInputStream.read(bbb)) != -1){
                System.out.print(new String(bbb, 0 , read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }




}
