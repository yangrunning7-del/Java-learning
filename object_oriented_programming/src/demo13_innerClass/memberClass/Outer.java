package demo13_innerClass.memberClass;

public class Outer {
    private int a = 10;

    class Inner {

        public void print() {
            System.out.println("Inner");
        }
    }

    // 在外部如何获取成员内部类的方法
    // new Outer,是获取Outer类，new Outer.new Inner是获取Outer类里面的Inner类对象，这样才可以调用它里面的方法
    // 1、通过 Outer.Inner = new Outer.new Inner,
    public Inner getInsantce(){
        return new Inner();
    }

}
