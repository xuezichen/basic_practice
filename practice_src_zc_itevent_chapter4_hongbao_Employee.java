package zc.itevent.chapter4.hongbao;

import java.util.ArrayList;
import java.util.Random;

public class Employee extends Users {
    public Employee() {
    }

    public Employee(String name, int totalmoney) {
        super(name, totalmoney);
    }

    public void receive(ArrayList<Integer> arrayList){


        if (arrayList.size() == 0){
            return;
        }else {
            int i = new Random().nextInt(arrayList.size());
            Integer del = arrayList.remove(i);

            System.out.println(super.getName()+"的余额为："+(super.getTotalmoney()+del)+"元");
        }



    }
}
