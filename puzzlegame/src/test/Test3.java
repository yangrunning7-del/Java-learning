package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test3 extends JFrame implements KeyListener {

    public Test3() {
        // 给游戏设置宽高
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图游戏 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，关掉所有界面，程序停止
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 取消默认的居中放置，只有取消了，才会按照xy轴的形式去放置图片
        this.setLayout(null);
        // 给整个界面添加监听事件
        this.addKeyListener(this);

        // ✅ 关键1：允许窗口获取键盘焦点
        this.setFocusable(true);
        // ✅ 关键2：显示窗口
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped 字符按键：" + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed 按下按键代码：" + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased 松开按键代码：" + e.getKeyCode());
    }

    // ✅ 关键3：main主方法启动程序
    public static void main(String[] args) {
        new Test3();
    }
}