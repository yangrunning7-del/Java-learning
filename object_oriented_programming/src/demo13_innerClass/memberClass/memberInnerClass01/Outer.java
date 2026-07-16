package demo13_innerClass.memberClass.memberInnerClass01;

public class Outer {
    int a = 10;
    class Inner {
        int a = 20;
        public void print() {
            int a = 30;
            //TODO 调用Outer外部类的a
            System.out.println(Outer.this.a);  // 要求结果10
            //TODO 调用本类Inner的a
            System.out.println(this.a);  // 要求结果20
            //TODO 就近调用a
            System.out.println(a);  // 要求结果30
        }
    }

    public Inner way(){
        return new Inner();
    }
}
