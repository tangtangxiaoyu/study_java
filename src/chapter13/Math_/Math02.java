package chapter13.Math_;

import java.util.Arrays;

public class Math02 {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 88, 66, 99, 0 };
        bubble01(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble01(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
