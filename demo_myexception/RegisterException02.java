package zc.itevent.demo_myexception;

/*
自定义异常类：
    java提供的异常类，不够我们使用，需要自己定义一些异常类
格式：
    public class XXXException extends Exception/RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
    }
    注意：
    1.自定义的异常类一般都是以Exception结尾，说明该类是一个异常类
    2.自定义异常类，必须得继承Exception或者RuntimeException
        继承Exception：那么自定义的异常类就是一个编译器异常，如果方法内部抛出了编译期异常，就必须处理这个
                       异常，要么throw要么try。。。catch
        继承RuntimeException：那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理
 */
public class RegisterException02 extends RuntimeException {
    //添加一个空参数的构造方法
    public RegisterException02(){
        super();
    }
    /*添加一个带异常信息的构造方法
    查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法的内部会调用父类异常信息的构造方法
    让父类来处理这个异常信息
    */
    public RegisterException02(String msg){
        super(msg);
    }

}
