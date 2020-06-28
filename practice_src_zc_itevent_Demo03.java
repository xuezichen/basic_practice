package zc.itevent;

//用递归计算1~100的和
public class Demo03 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(sum(100));
        long e = System.currentTimeMillis();
        System.out.println(e);
        System.out.println((e-s));
    }

    public static int sum(int n){

        if (n==1) return 1;

        return n+sum(n-1);

    }

}
