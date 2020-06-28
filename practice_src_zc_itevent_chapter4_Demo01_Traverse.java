package zc.itevent.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 生成6个1~33之间的随机整数,添加到集合,并遍历
 */
public class Demo01_Traverse {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int rand = new Random().nextInt(33);
            arrayList.add(rand);
        }
        Arrays.sort(arrayList.toArray());
        System.out.print(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

}
