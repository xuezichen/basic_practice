package zc.itevent.chapter3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用日期时间相关的API，做一个天数转换器
 */
public class Demo04_Birthday {
    public static void main(String[] args) throws ParseException {
        System.out.println("---------------天数转换器---------------");
        System.out.print("请按照标准格式输入想测试的日期：");
        String str = new Scanner(System.in).nextLine();

        System.out.println("从"+str+"到现在已经"+day(str)+"天了！");
    }

    public static long day(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yy年MM月dd日");
        Date date = sdf.parse(str);

        long begin = date.getTime();

        long now = System.currentTimeMillis();

        long l = now-begin;

        long days = l/1000/60/60/24;
        return days;
    }
}
