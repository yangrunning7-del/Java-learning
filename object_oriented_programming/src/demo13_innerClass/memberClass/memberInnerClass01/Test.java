package demo13_innerClass.memberClass.memberInnerClass01;

public class Test {
    public static void main(String[] args) {
        // 如果外部类成员变量名与内部类成员变量名相同，该如何从内部去调用它呢？

        // 1、通过编写外部方法（该方法返回一个内部类对象），对外提供内部类对象
        Outer outer = new Outer();
        outer.way().print();
        System.out.println("===========================");

        // 2、 当成员内部类被非私有修饰时 通过调用对象的方式去调用它
        Outer.Inner oi = new Outer().new Inner();
        oi.print();
        // TODO       关于第13行代码
        //            1、当执行new Outer()时，会在方法区中加载Outer类，同时在堆内存中开辟一个空间用于a = 10
        //            2、之后执行new Outer()时，会在方法区中加载Outer类里面的Inner类，同时也会在堆内存中开辟一个内存空间用于a = 20
        //            3、同时Java虚拟机也会在该堆内存创建一个变量Outer.this，指向调用者的地址，调用者为Outer，也就是可以指向a = 10
        // TODO

        /*

            package demo13_innerClass.memberClass.memberInnerClass01;

            public class Outer {
                int a = 10;
                class Inner {
                    int a = 20;
                    public void print() {
                        int a = 30;
                        // 调用Outer外部类的a
                        System.out.println(Outer.this.a);  // 要求结果10
                        // 调用本类Inner的a
                        System.out.println(this.a);  // 要求结果20
                        // 就近调用a
                        System.out.println(a);  // 要求结果30
                    }
                }

                public Inner way(){
                    return new Inner();
                }
            }

         */

    }
}
