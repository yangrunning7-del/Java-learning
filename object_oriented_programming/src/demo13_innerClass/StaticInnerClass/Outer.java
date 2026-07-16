package demo13_innerClass.StaticInnerClass;

public class Outer {

    static int a = 1;
    int b = 2;
     static class Inner {
        public static void way1 (){
            System.out.println("静态内部类方法");

        }

        public void way2 (){
            System.out.println("非静态内部类方法");

        }
    }
}
