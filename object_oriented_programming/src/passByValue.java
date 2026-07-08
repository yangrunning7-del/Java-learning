public class passByValue {
    public static void main(String[] args) {
        // 在main类中，把1赋值给a

        int a = 1;
        System.out.println(a);

        // 输出的值为1
        // 注意在main中的a，与在change类中的a不是一个a，虽然都命名为a，但是在栈内存的地址是不同的。
        // 在change类中的把10赋值给在change类的a，与在main中的a没有关系，所以打印出来的还是1.
        change(a);
        System.out.println(a);

    }


    public static void change(int a) {
        // 在change类中， 把10赋值给a
        a = 10;
    }

}
