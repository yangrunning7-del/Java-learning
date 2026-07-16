package ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    // 与注册相关的代码

    public RegisterJFrame() {
        // 设置宽高
        this.setSize(488, 500);
        // 设置界面的标题
        this.setTitle("拼图游戏 注册");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，关掉所有界面，程序停止
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        // 设置界面显示
        this.setVisible(true);
    }
}
