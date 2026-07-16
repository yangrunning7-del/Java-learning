package demo13_innerClass.memberClass;

public class Test {
    public static void main(String[] args) {
        // 通过外部类的方法来调用内部类
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInsantce();
        inner.print();

    }
}
