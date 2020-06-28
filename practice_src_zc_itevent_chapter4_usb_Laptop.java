package zc.itevent.chapter4.usb;

public class Laptop {


    public void run() {
        System.out.println("电脑开启！");
    }


    public  void useUsb(Usb usb){

        usb.run();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else  if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.type();
        }

        usb.close();
    }


    public void close() {
        System.out.println("电脑关闭！");
    }
}
