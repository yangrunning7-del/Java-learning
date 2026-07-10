package demo13_innerClass;

public class Outer {

    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    // 内部类
    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
    }

}
