package test;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(603, 680);
        //
        jFrame.setTitle("事件演示");
        //
        jFrame.setAlwaysOnTop(true);
        //
        jFrame.setLocationRelativeTo(null);
        //
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        jFrame.setLayout(null);


        // 创建一个按钮对象
        JButton jtb = new JButton("点击我");
        // 设置位置和宽高
        jtb.setBounds(0, 0, 100, 50);

        // 给按钮添加监听对象
        // jtb：组件对象，表示要给哪个组件添加事件
        // addActionListener:表示我要给组件添加哪个事件监听
        // 参数；事件被触发之后要执行的代码
        // jtb.addActionListener(new MyActionListener());// ActionListener是一个接口
        // 匿名内部类的形式来写
        jtb.addActionListener(new MyActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("被坤坤了");
            }
        });


        // 添加按钮
        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);

    }
}
