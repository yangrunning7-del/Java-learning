package exception.Customize;

public class TestApp {
    public static void main(String[] args) {
        try {
            AgeChecker.checkAge(-5); // 传入非法数据
        } catch (MyException e) {
            // 打印出来的是：MyException{非法数据=-5}
            System.out.println(e);
        }
    }
}
