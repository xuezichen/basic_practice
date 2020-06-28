package zc.itevent;

//用for循环计算1~100的和
public class Demo02 {
    public static void main(String[] args) {

        long s = System.currentTimeMillis();
        System.out.println(s);

        int n = 0;
        for (int i = 1; i <= 100; i++) {
            n += i;
        }
        System.out.println(n);

        long e = System.currentTimeMillis();
        System.out.println(e);
        long time = e-s;
        System.out.println(time);
    }
}
