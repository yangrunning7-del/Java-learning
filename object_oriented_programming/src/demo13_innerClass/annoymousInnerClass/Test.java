package demo13_innerClass.annoymousInnerClass;





public class Test {
    /*
        匿名内部类：
            1、匿名内部类的创建格式
                new 类名或接口名(){
                    重写该抽象类的方法或者实现接口里的方法
                }
            2、匿名内部类的理解
                匿名内部类实际指的是大括号里面的内容，是一个没有命名的类{}
                与类名或者接口的关系：
                    -- 要么就是这个匿名类{}重写了该接口，要么就是继承了该类
                关于new 和小括号(),这表明创建了一个对象，但是没有命名，该对象就是这个匿名类{}的对象，
                所以整体是一个对象，只是没有整体命名，但是可以直接调用里面的方法

                如：
                    new 类名或接口名(){
                    重写该抽象类的方法或者实现接口里的方法
                }.方法名
     */


    public static void main(String[] args) {

        new Swim(){
            @Override
            public void swim() {
                System.out.println("在内部类中实现了接口Swim的方法");
            }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };




        method(
                new Animal(){
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );


        // TODO 不用内部类的方法来调用下面的method方法
        // TODO 那么就要重新去定义一个Dog类来作为对象调用的类
        Dog d = new Dog();
        method(d);
    }

    public static void method(Animal a){
        a.eat();
    }


}
