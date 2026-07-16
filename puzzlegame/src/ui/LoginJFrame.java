package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // 与登录操作相关的代码

    // 构造方法，在调用该类的对象时，会默认调用构造方法
    public LoginJFrame() {
        // 在创建界面时同时设置一些必要的信息 ---> 初始化，通过构造方法

        // this:指代当前本类的实例对象，保存当前对象的内存地址，用于访问本类的成员方法 / 成员变量
        // 启动无参构造，就会给该对象设置界面，因为返回的是该对象的地址值
        /*
            new LoginJFrame()：是 new 关键字做两件事
                    1.在堆内存开辟内存，创建对象，产生对象地址
                    2.调用构造方法做初始化
                    3.最后把地址赋值给引用变量，也可以留在对象本身
         */

        // 给登录界面设置宽高
        this.setSize(488, 430);
        // 设置界面的标题
        this.setTitle("拼图游戏 登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，关掉所有界面，程序停止
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);







        // 让登录界面显示出来
        this.setVisible(true);

    }
}
