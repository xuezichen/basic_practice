package zc.itevent.chapter4;

import java.util.ArrayList;
import java.util.Random;

/**
 * 定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
 */
public class Demo02_evenNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int x  = 0;
        for (int i = 0; i < 100; i++) {
           x = new Random().nextInt(1000);
           list.add(x);
        }


        ArrayList<Integer> arrayList = method(list);

        for (Integer li : arrayList) {
            System.out.println(li);
        }

    }

    public static ArrayList<Integer> method(ArrayList<Integer> list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i : list) {
            if (i%2 == 0){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

}
