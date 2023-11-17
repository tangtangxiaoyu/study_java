package chapter19.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\chapter19\\mysql.properties"));
        String str = "";
        while (( str = bufferedReader.readLine()) != null){
            String[] stringsArr = str.split("=");
            System.out.println(stringsArr[0] + "内容是" + stringsArr[1]);
        }
        bufferedReader.close();
    }
}
