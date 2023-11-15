package chapter19.standard;

public class InputOutput {
    public static void main(String[] args) {
        // System.in 编译类型  InputStream
        // System.in 运行类型  BufferedInputStream
        System.out.println( System.in.getClass() );

        // System.out 编译类型  PrintStream
        // System.out 运行类型  PrintStream
        System.out.println( System.out.getClass() );
    }
}
