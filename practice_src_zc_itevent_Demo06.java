package zc.itevent;

import java.util.HashMap;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现次数。
 */
public class Demo06 {
    public static void main(String[] args) {

        System.out.println("-------------------这是一个字符字数检测器------------------");
        System.out.print("请输入你想检测的文本：");
        String str = new Scanner(System.in).next();

        Method(str);

    }
    public static void Method(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        if (str == null) System.out.println("输入有误");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                count = map.get(c);
                count++;
                map.put(c,count);
            }

        }
        System.out.println(map);



    }

}
