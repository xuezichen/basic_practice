package zc.itevent.chapter3;

import java.util.Scanner;

/**
 * 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 */

public class Demo07_Count {
    public static void main(String[] args) {
        System.out.println("----------------字符个数检测器----------------");
        System.out.print("请输入你想检测的字符串:");
        String str = new Scanner(System.in).nextLine();

        count(str);
    }

    private static void count(String str) {
        char[] chars = str.toCharArray();

        int ncount = 0;
        int acount = 0;
        int Acount = 0;
        for (char c : chars) {
            if (c>='0' && c<='9') {
                ncount++;
            }else if (c>='a'&& c<='z'){
                acount++;
            }else if(c>='A'&&c<='Z'){
                Acount++;
            }

        }
        System.out.println("数字有"+ncount+"个");
        System.out.println("小写字母有"+acount+"个");
        System.out.println("大写字母有"+Acount+"个");


    }
}
