package chapter13.System_;

import java.util.Arrays;

public class System01 {
    public static void main(String[] args) {

//        System.exit(0); //0状态0退出

        int[] src = {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,1,2);
        System.out.println(Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());

    }
}
