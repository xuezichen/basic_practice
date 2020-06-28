package zc.itevent.chapter3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class Demo03_PrintArray {
    public static void main(String[] args) {
        System.out.print("请输入你想排序的字符串：");
        String str = new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        print(chars);
    }

    public static void print(char[] chars){

        Arrays.sort(chars);

        System.out.println(chars);

        for (int i = chars.length-1; i >=0; i--) {
                System.out.print(chars[i]);
        }

    }

}
