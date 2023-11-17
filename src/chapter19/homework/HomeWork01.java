package chapter19.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String str1 = "f:\\cs";
        String str2 = "f:\\cs" + "\\1.txt";
        File file = new File(str1);
        if(!(file.exists())){
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
        File ft = new File(str2);
        if(!(ft.exists())){
            if(ft.createNewFile()){
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ft));
                bufferedWriter.write("hello");
                bufferedWriter.close();
            }else{
                System.out.println("创建失败");
            }
        } else {
            System.out.println("已存在");
        }
    }
}
