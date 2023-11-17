package chapter19.homework;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) throws IOException {

        // BufferedReader bufferedReader = new BufferedReader(new FileReader("f:\\1.txt"));
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream("f:\\1.txt"), "GBK") );

        String values = "";
        int num = 1;
        while ((values = bufferedReader.readLine()) != null){
            System.out.println(num + ". " + values);
            num++;
        }
        bufferedReader.close();
    }
}