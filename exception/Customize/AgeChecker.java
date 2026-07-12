package exception.Customize;

public class AgeChecker {
    // 加上 static，方便 main 方法直接调用
    public static void checkAge(int age) throws MyException {
        if (age < 0 || age > 150) {
            // 调用MyException类
            throw new MyException(age); // 把坏数字装进盒子扔出去
        }
        System.out.println("年龄合法");
    }
}