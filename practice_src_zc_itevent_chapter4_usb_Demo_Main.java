package zc.itevent.chapter4.usb;

public class Demo_Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        Laptop laptop = new Laptop();

        laptop.run();
        laptop.useUsb(mouse);
        laptop.useUsb(keyBoard);
        laptop.close();
    }
}
