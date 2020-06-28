package zc.itevent;

import java.util.Scanner;

/**
 * 有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后
 * 每个月又生一对兔子，假如兔子都不死，问n个月后的兔子总数为多少。
 */
public class Demo01 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("您想算多少个月后的兔子数量呢：");
        int i = sc.nextInt();

        System.out.println(method(i));
        long x = System.currentTimeMillis();
        System.out.println((x-l)/1000+"秒");
    }

    private static Integer method(int i) {
        int n1 = 1;
        int n2 = 1;
        int n3 = n1 + n2;
        if (i<1) System.out.println("输入有误");
        if (i == 1 || i == 2){
            return 1;
        }else {
            for (int j = 3; j <= i; j++) {
                n3 = n1 +n2;
                n1 = n2;
                n2 = n3;
            }
        }
        return n3;
    }
}
