package demo07;

public class A extends B{

    public static void test(){
        System.out.println("A-->test");
    }

    @Override // 注解：有功能的注释
    public void print(){
        System.out.println("A-->print");
    }
}
