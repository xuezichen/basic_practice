package zc.itevent.chapter4.hongbao;

import java.util.ArrayList;

public class Manager extends Users{

    public Manager() {
    }

    public Manager(String name, int totalmoney) {
        super(name, totalmoney);
    }

    public ArrayList<Integer> sendMoney(int money, int count){
        ArrayList<Integer> arrayList = new ArrayList<>();

       if (money>super.getTotalmoney()){
           System.out.println("余额不足，请充值！");
           return arrayList;
       }

        int avg = money / count;
        int mod = money % count;

        for (int i = 0; i < count-1; i++) {
            arrayList.add(avg);
        }

        int last = avg+mod;
        arrayList.add(last);


        System.out.println(super.getName()+"的余额为："+(super.getTotalmoney()- money)+"元");
        return arrayList;
    }

}
