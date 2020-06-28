package zc.itevent.chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏 游戏开始时，会随机生成一个1-100之间的整数 number .
 * 玩家猜测一个数字 guessNumber ，会与 number 作比 较，
 * 系统提示大了或者小了，直到玩家猜中，游戏结束。
 */
public class Demo05_GuessNumber {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------猜数字小游戏-----------------");
        int num = new Random().nextInt(100);

        System.out.println("谜底是："+num);

        while (true) {
        System.out.print("请输入你猜的数字：");
        int guessnum = new Scanner(System.in).nextInt();

            if (num > guessnum) {
                System.out.println("哥，小了小了，再猜！");
                Thread.sleep(1000);
            } else if (num < guessnum) {
                System.out.println("哥，大了大了，再猜！");
                Thread.sleep(1000);
            }else if(num == guessnum){
                System.out.println("卧槽，哥，你可真厉害，算你赢了，再见！");
                break;
            }
        }


    }

}
