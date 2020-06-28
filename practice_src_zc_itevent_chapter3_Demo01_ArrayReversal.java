package zc.itevent.chapter3;

import java.util.Arrays;

/*
数组反转
 */
public class Demo01_ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int max = arr.length-1,min = 0; max >= min; max--,min++ ){
            int temp = 0;
            temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
