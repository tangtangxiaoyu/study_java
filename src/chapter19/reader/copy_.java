package chapter19.reader;

import java.io.*;

public class copy_ {
    public static void main(String[] args) {
        String str1 = "f:\\FileReader_.java";
        String str2 = "d:\\FileReader222_.java";
        BufferedReader bf = null;
        BufferedWriter bw = null;
        String str;
        try {
            bf = new BufferedReader(new FileReader(str1));
            bw = new BufferedWriter(new FileWriter(str2));
            while ( (str = bf.readLine()) != null ){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bf != null){
                    bf.close();
                }
                if(bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
