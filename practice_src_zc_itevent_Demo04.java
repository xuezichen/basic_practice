package zc.itevent;
//打印99乘法表
public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" x "+ i +" = "+i*j+"  ");
            }
            System.out.println();
        }

        for (int i = 9;i >=1;i--){
            for (int j = 1;j <= i;j++){

                System.out.print(j+" x "+ i +" = "+i*j+"  ");

            }
            System.out.println();
        }
    }
}
