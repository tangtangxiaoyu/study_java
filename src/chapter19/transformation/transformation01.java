package chapter19.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class transformation01 {
    public static void main(String[] args) throws IOException {
        String str = "f:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}
