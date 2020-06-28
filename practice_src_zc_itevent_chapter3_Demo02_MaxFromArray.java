package zc.itevent.chapter3;

/**
 * 最大值获取：从数组的所有元素中找出最大值。
 */
public class Demo02_MaxFromArray {
    public static void main(String[] args) {

        int[] arr = {1,4,2,5,7,8,6,4};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>temp){
                temp = arr[i];
            }

        }
        System.out.println(temp);

    }
}
