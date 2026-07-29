package game;

import domain.User;
import util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginFrame extends JFrame implements MouseListener {
    // 设置一个集合用于存储用户信息也就是用户名和密码,所以对象为User，并且随着构造方法的调用只执行一次，所以选择static
    // 集合的类型要为user
    static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User("zhangShan", "123456"));
        allUsers.add(new User("lisi", "123456"));
    }


    // 添加登录按钮，注册按钮，用户名和密码输入框，还有验证码输入框
    JButton login = new JButton();
    JButton register = new JButton();

    // 用户名与密码输入框
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();

    // 验证码输入框
    JTextField code = new JTextField();
    //正确的验证码
    JLabel rightCode = new JLabel();

    public LoginFrame() {
        // 初始化页面
        initJFrame();
        // 添加组件

        initView();

        //显示当前页面
        this.setVisible(true);

    }

    private void initView() {
        //1. 添加用户名文字
        Font usernameFont = new Font(null, 1, 16); // 设置字体
        JLabel usernameText = new JLabel("用户名"); // 设置用户名组件，也就是第一行的最左边
        usernameText.setForeground(Color.white); // 设置颜色
        usernameText.setFont(usernameFont); // 把字体的设置，传给用户名组件
        usernameText.setBounds(140, 55, 55, 22);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(223, 46, 200, 30);
        // 添加到当前页面中
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel("密码");
        Font passwordFont = new Font(null, 1, 16);
        passwordText.setForeground(Color.white);
        passwordText.setFont(passwordFont);
        passwordText.setBounds(197, 95, 40, 22);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(263, 87, 160, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel("验证码");
        Font codeFont = new Font(null, 1, 16);
        codeText.setForeground(Color.white);
        codeText.setFont(codeFont);
        codeText.setBounds(215, 142, 55, 22);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(291, 133, 100, 30);
        this.getContentPane().add(code);

        //获取正确的验证码
        String codeStr = CodeUtil.getCode();
        Font rightCodeFont = new Font(null, 1, 15);
        //设置颜色
        rightCode.setForeground(Color.RED);
        //设置字体
        rightCode.setFont(rightCodeFont);
        //设置内容
        rightCode.setText(codeStr);
        //绑定鼠标事件
        rightCode.addMouseListener(this);
        //位置和宽高
        rightCode.setBounds(400, 133, 100, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(177, 310, 128, 47);
        login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按钮.png"));
        //去除按钮的边框
        login.setBorderPainted(false);
        //去除按钮的背景
        login.setContentAreaFilled(false);
        //给登录按钮绑定鼠标事件
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(310, 310, 128, 47);
        register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按钮.png"));
        //去除按钮的边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);
        //给注册按钮绑定鼠标事件
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("farmerandlord\\image\\login\\background.png"));
        background.setBounds(0, 0, 633, 423);
        this.getContentPane().add(background);


    }

    private void initJFrame() {
        this.setSize(633, 423); // 设置宽高
        this.setTitle("斗地主游戏 v1.0Login"); // 设置左上角文本提示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭模式
        this.setLocationRelativeTo(null); // 设置页面居中
        this.setAlwaysOnTop(true); // 设置页面总是在最上方
        this.setLayout(null); // 组件方式不为默认设置
    }

    //展示弹框
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);
        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            // 获取用户输入的用户名，密码，和验证码
            String inputName = username.getText();
            String inputPassword = password.getText();
            String inputCode = code.getText();

            // 判断验证码是否正确
            if (!rightCode.getText().equals(code.getText())) {
                showJDialog("您的验证码输入错误");
                return;
            }

            if (inputCode.length() == 0) {
                showJDialog("您的验证输入为空");
                return;
            }
            if (inputName.length() == 0 || inputPassword.length() == 0) {
                showJDialog("您的用户名或密码不能为空");
                return;
            }

            User userinfo = new User(inputName, inputPassword);
            if (allUsers.contains(userinfo)) {
                // 关闭登录页面
                this.setVisible(false);
                new GameJFrame();
            }else {
                showJDialog("你的用户名或者密码输入错误");
            }


        } else if (source == register) {
            System.out.println("点击了注册按钮");
        } else if (source == rightCode) {
            // 获取新的验证码
            String code = CodeUtil.getCode();
            // 更新新的验证码
            rightCode.setText(code);
        }

    }

    // 按住不放
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            // 更改登录按钮的颜色
            login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按下.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按下.png"));
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("farmerandlord\\image\\login\\登录按钮.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("farmerandlord\\image\\login\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
