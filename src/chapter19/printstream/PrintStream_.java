package chapter19.printstream;


import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        out.print("1111");
        out.close();
        System.setOut(new PrintStream("f:\\f1.txt"));
        System.out.println(11111);
    }
}
