package zc.itevent.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        //准备牌
        String[] hua = {"♦","♣","♠","♥"};
        String[] num = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(hua[i]+num[j]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        System.out.println(poker);

        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51){
                dipai.add(p);
            } else if (i%3 == 0){
                player1.add(p);
            }else if (i%3 == 1){
                player2.add(p);
            }else if (i%3 == 2){
                player3.add(p);
            }
        }


        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
