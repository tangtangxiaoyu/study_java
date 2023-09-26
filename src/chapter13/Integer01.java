package chapter13;

public class Integer01 {
    public static void main(String[] args) {
        /*
        * jdk5 之前是手动装箱 拆箱
        * */
        int n1 = 100;

        Integer integer = new Integer(n1); //装箱
        Integer integer1 = Integer.valueOf(n1); //装箱

        int i = integer.intValue(); //拆箱

        /**
         * jdk5以后自动装箱拆箱
         * */
        int n2 = 100;
        Integer integer2 = n2; //自动装箱
        int n3 = integer2;  //自动拆箱

    }
}
