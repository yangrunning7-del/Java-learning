package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // GameJFrame表述游戏的主界面，继承了JFrame类(表示界面)
    // 把与游戏相关的逻辑都写在这里面

    public GameJFrame() {

        initFrame();

        initJMemuBar();


        // 让界面显示出来
        this.setVisible(true);
    }

    private void initJMemuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu funcationJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        // 创建选项下的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        // 将每个选项下面的条目添加到选项当中
        funcationJmenu.add(replayItem);
        funcationJmenu.add(reLoginItem);
        funcationJmenu.add(closeItem);

        funcationJmenu.add(accountItem);

        // 将菜单的两个选项添加到菜单中
        jMenuBar.add(funcationJmenu);
        jMenuBar.add(aboutJmenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initFrame() {
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
    }
}
