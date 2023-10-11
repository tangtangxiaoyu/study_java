package chapter13.Math_;

import java.util.Arrays;
import java.util.List;

public class Math03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // 如果可以找到  返回下标  找不到返回 '- (low + 1)'
        System.out.println(Arrays.binarySearch(arr,999));

        int[] arr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr2));

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println(isEqual);

        List a3 = Arrays.asList(1,2,3);
        System.out.println(a3.getClass());
        /***
         * 返回List类型
         * 编译类型是 List
         * 运行类型  java.util.Arrays$ArrayList
         */
    }
}
