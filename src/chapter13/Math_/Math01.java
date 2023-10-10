package chapter13.Math_;

import java.util.Arrays;
import java.util.Comparator;

public class Math01 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println((int)(2+Math.random()*6));;
//        }
        Integer[] arr = { 1, 50, 36, 99 };
//        Arrays.sort(arr);
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
