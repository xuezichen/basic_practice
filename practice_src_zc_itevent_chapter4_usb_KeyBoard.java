package zc.itevent.chapter4.usb;

public class KeyBoard implements Usb{
    @Override
    public void run() {
        System.out.println("键盘已安全连接！");
    }

    public  void type(){
        System.out.println("正在使用键盘输入！");
    }

    @Override
    public void close() {
        System.out.println("键盘已安全拔出！");
    }
}
