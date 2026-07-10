package demo08;

    /*
    多态：
        定义：同一个方法可以根据对象的不同，而采取多种不同的行为模式
        一个对象的实际类型是确定的，但是可以指向对象的引用类型有很多

        存在条件：
            1、有继承关系
            2、子类要重写父类的方法
            3、父类引用指向子类对象
        注意点：
            多态是方法的多态，属性没有多态
            报错词instanceof
    */

public class Application {
    public static void main(String[] args){

        // 一个对象的实际类型是确定的,就是看左边的
        // new Student();new Person();

        //但可以指向的引用类型就不确定了：父类的引用指向子类，如Person stu2 = new Student();父类被子类重写了


        // Student类可以调用的方法都是自己的或者是继承父类的
        Student stu1 = new Student();

        // 父类型，可以指向子类，但是不能调用子类独有的方法，因为类不同，虽然有继承关系，除非转化成类相同
        Person stu2 = new Student();
        // Object stu3 = new Student();



        // 对象可以执行哪些方法，主要看对象左边的类型，和右边的关系不大
        // 输出：son
        stu1.run();

        // 输出：son，因为父类的Person被子类Student给重写
        stu2.run();

        // stu2本来是Person父类，不可以调用子类独有的方法
        // 但是将它强制转化为Student类后，就可以调用子类的方法
        ((Student)stu2).test();



    }
}
