package demo11_abstract;

// abstract 抽象类
public abstract class Action {
    // 约束~有另外的人专门来实现
    // abstract，抽象方法，只有方法名字，没有方法的实现！
    public abstract void action();

    /*
        1、不能new这个抽象类，只能靠子类去实现它：约束！
        2、抽象类中可以写普通的方法
        3、抽象的方法只能写再抽象类中

        // 抽象类存在构造器吗？
        // 抽象类存在的意义？

     */


}
