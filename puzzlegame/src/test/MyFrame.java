package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {

    // 两个按钮
    JButton jtb1 = new JButton("按钮1");
    JButton jtb2 = new JButton("按钮2");

    public MyFrame() {
            this.setSize(603, 680);
            this.setTitle("拼图游戏 v1.0");
            this.setAlwaysOnTop(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setLayout(null);


            // 给按钮添加事件，也可以用匿名类的写法
            jtb1.setBounds(0, 0, 100, 50);
            jtb1.addActionListener(this);
            jtb2.setBounds(100, 0, 100, 50);
            jtb2.addActionListener(this);

            this.getContentPane().add(jtb1);
            this.getContentPane().add(jtb2);

            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == jtb1) {
            jtb1.setSize(500, 500);
        }else if (obj == jtb2) {
            Random r = new Random();
            jtb2.setSize(r.nextInt(500),r.nextInt(500));
        }

    }
}
