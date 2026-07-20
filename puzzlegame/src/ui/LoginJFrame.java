package puzzlegame.src.ui;

import javax.swing.*;

import domain.User;
import puzzlegame.src.ui.GameJFrame;
import util.CodeUtil;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    // 与登录操作相关的代码

    // 验证码
    String codeStr = CodeUtil.getCode();
    JLabel rightCode = new JLabel();
    // 用户名和密码
    static ArrayList<User> allUser = new ArrayList<User>();
    static {
        allUser.add(new User("ZhangShan", "123456"));
        allUser.add(new User("LiShi", "123456"));
    }
    // 用户名输入框
    JTextField username = new JTextField();
    // 密码输入框
    JTextField password = new JTextField();
    // 验证码输入框
    JTextField code = new JTextField();

    // 登录与注册按钮
    JButton login = new JButton();
    JButton register = new JButton();

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

        interviewPage();



        // 让登录界面显示出来
        this.setVisible(true);

    }



    private void interviewPage() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);


        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);


        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        // 给登录按钮绑定鼠标事件
        login.addMouseListener(this);
        // 给注册按钮绑定鼠标事件
        register.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            ImageIcon label = new ImageIcon("puzzlegame\\image\\login\\登录按下.png");
            login.setIcon((Icon) label);
        }
        if (obj == register) {
            ImageIcon label = new ImageIcon("puzzlegame\\image\\login\\注册按下.png");
            register.setIcon((Icon) label);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            // 按下按钮后，按钮的颜色会改变
            ImageIcon label = new ImageIcon("puzzlegame\\image\\login\\登录按钮.png");
            login.setIcon((Icon) label);
            // 获取输入框的用户名,密码和验证码
            String userNameInput = username.getText();
            String userPasswordInput = password.getText();
            String verifyCodeInput = code.getText();

            // 判断账号密码和验证码是否正确
            if (verifyCodeInput.equals("")) {
                jdialogContent("请输入验证码");
            }else if (!verifyCodeInput.equals(codeStr)) {
                jdialogContent("验证码输入错误");
                // 清空验证码
                code.setText("");
                // 重新生成验证码
                codeStr = CodeUtil.getCode();
                // 重新获取正确的验证码
                rightCode.setText(codeStr);
            }else if(userNameInput.equals("") || userPasswordInput.equals("")) {
                jdialogContent("用户名或密码为空");
                username.setText("");
                password.setText("");
            } else {
                boolean flag = false;
                for (User user : allUser) {
                    // 为了遍历出集合中每一个User的名字和密码，所以需要在user类中添加方法来获取它们的名字和密码
                    if(user.getName().equals(userNameInput) && user.getPassword().equals(userPasswordInput)) {
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    new GameJFrame();
                    this.dispose();
                }else{
                    jdialogContent("用户名或密码输入错误");
                    username.setText("");
                    password.setText("");
                }

            }


        }
        if (obj == register) {
            ImageIcon label = new ImageIcon("puzzlegame\\image\\login\\注册按钮.png");
            register.setIcon((Icon) label);
        }

    }

    private void jdialogContent(String str) {
        // 创建弹窗，绑定当前登录窗口
        JDialog dialog = new JDialog(this);
        dialog.setTitle("输入错误");
        // 1. 设置弹窗大小
        dialog.setSize(300, 150);
        // 2. 弹窗居中
        dialog.setLocationRelativeTo(null);
        // 3. 设置关闭规则
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setLayout(null);

        // 弹窗内添加提示文字(弹窗内容)
        JLabel tipLabel = new JLabel(str);
        tipLabel.setBounds(80, 50, 150, 20);
        dialog.getContentPane().add(tipLabel);

        // 4. 关键：设置可见，弹窗才会自动弹出
        dialog.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
