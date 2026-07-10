package demo10;

public class Student {

    private static int age; // 静态变量，多线程
    private double score; // 非静态变量

    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args){
        go();   // 静态的方法可以直接调用
    }
}
