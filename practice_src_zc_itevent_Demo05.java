package zc.itevent;

//使用递归计算阶乘
public class Demo05 {
    public static void main(String[] args) {
        System.out.println(jieChen(5));
    }
    public static int jieChen(int n){
        if (n == 1) return 1;

         return n * jieChen(n-1);
    }
}
