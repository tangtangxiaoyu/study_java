package chapter12;

public class Exception02 {
    public static void main(String[] args) {
        /**
         *
         * 1.NullPointerException  空指针异常
         * String name = null;
         * System.out.println(name.length());
         *
         *
         * 2.ArithmeticException  算数异常
         * int n1 = 10;
         * int n2 = 0;
         * int res = n1 / n2;
         *
         *
         * 3.ArrayIndexOutOfBoundsException  数组下标越界
         * int[] arr = { 0,1,2,3 };
         * System.out.println(arr[5]);
         *
         *
         * 4.ClassCastException
         * class A {}
         * class B extends A {}
         * class C extends A {}
         *
         * A b1 = new B();
         * B b2 = (B)b1;
         * C c = (C)b1;
         *
         * 5.NumberFormatException
         * String name = "1234r";
         * int num = Integer.parseInt(name);
         *
         */
        System.out.println("五大运行时异常");
    }
}


