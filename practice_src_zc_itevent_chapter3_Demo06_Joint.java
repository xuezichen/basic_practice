package zc.itevent.chapter3;

/**
 * 定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class Demo06_Joint {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        joint(arr);
    }
    public static void joint(int[] arr){

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1){
                System.out.print("word"+arr[i]+"#");
            }else if (i == arr.length-1){
                System.out.println("word"+arr[i]+"}");
            }
        }


    }
}
