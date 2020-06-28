package zc.itevent.chapter4.hongbao;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_Main {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Employee employee1 = new Employee("张三",20);
        Employee employee2 = new Employee("李四",10);
        Employee employee3 = new Employee("王五",30);

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要发送的金额：");
        int money = sc.nextInt();
        System.out.print("您要发几份：");
        int count = sc.nextInt();

        ArrayList<Integer> list = manager.sendMoney(money, count);
        employee1.receive(list);
        employee2.receive(list);
        employee3.receive(list);
    }
}
