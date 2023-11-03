package chapter17.CpuNumber;

public class CpuNumber {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors()); //获取当前电脑cpu数量
    }
}
