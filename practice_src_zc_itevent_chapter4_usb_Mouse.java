package zc.itevent.chapter4.usb;

public class Mouse implements Usb{
    @Override
    public void run() {
        System.out.println("鼠标已连接！");
    }

    public void click(){
        System.out.println("鼠标正在点击！");
    }

    @Override
    public void close() {
        System.out.println("鼠标已安全拔出！");
    }
}
