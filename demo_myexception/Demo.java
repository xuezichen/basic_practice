package zc.itevent.demo_myexception;

import java.util.Scanner;

/*
我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
 */
public class Demo {
    //定义在成员变量位置，方便别的地方使用。
    static String[] name = {"Jack","Rose","Jay","Jim"};

    public static void main(String[] args) /*throws RegisterException*/ {
        System.out.print("请输入您要注册的用户名：");
        String s = new Scanner(System.in).next();

        checkUsername(s);
    }

    private static void checkUsername(String str) /*throws RegisterException*/ {
        for (String s : name) {
            if (s.equals(str)){
                throw new RegisterException02("此用户名已被使用");
            }
        }
        System.out.println("恭喜你，注册成功！");
    }
}
