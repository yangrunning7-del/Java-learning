package exception.Customize;

public class MyException extends Exception{

    // 传递数字10
    private int detail;


    // 有参构造器，必须要有个构造器
    public MyException(int a) {
        this.detail = a;
    }
    //toString:异常的打印信息
    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
