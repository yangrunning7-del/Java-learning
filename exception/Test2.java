package exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 要选择代码块然后,ctrl + alt + T
        // 选中这行代码 加快捷键。System.out.println(a / b);

        try {
            new Test2().test(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    // 假设这个方法中，处理不了这个异常。方法向上抛出异常
    public void test(int a, int b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException("ArithmeticException");
        }
        System.out.println(a / b);
    }

}
