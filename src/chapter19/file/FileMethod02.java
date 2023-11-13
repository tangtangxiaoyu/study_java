package chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileMethod02 {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        File file = new File("f:\\news1.txt");
        System.out.println("文件名称  " + file.getName());
        System.out.println("绝对路径  " + file.getAbsolutePath());
        System.out.println("父级目录  " + file.getParent());
        System.out.println("文件大小  " + file.length());
        System.out.println("是否存在  " + file.exists());
        System.out.println("是否文件  " + file.isFile());
        System.out.println("是否目录  " + file.isDirectory());
    }
}
