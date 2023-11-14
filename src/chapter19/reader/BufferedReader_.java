package chapter19.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String str = "f:\\1.txt";
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(str));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
