package puzzlegame.src.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {
    // GameJFrame表述游戏的主界面，继承了JFrame类(表示界面)
    // 把与游戏相关的逻辑都写在这里面

    // 创建一个二维数组
    // 目的：为了管理数据
    // 加载图片时，会根据二维数组的数据进行加载
    int[][] data = new int[4][4];

    // 记录空白方块在二维数组中的位置
    int x = 0, y = 0;

    // 记录路径
    String path = "puzzlegame\\image\\animal\\animal1\\";

    // 用于判断胜利
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    // 用于统计部数
    int step = 0;

    // 创建选项下的条目对象（要写在方法外，否则只有一个方法可以调用它）
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        // 初始化界面
        initFrame();

        // 初始化菜单
        initJMemuBar();

        // 初始化数据，将图片打乱
        initData();

        // 初始化图片
        initImage();


        // 让界面显示出来
        this.setVisible(true);
    }

    // 初始化数据(打乱)
    private void initData() {
        // 把一个一维数组的数据：0~15打乱顺序
        // 再按照4个一组的方式添加到二维数组中

        // 定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp  = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }



        // 把一维数组赋值到二维数组中
        // 法一
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];


        }
        // 法二
//        int idx = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                data[i][j] = tempArr[idx];
//                idx++;
//            }
//        }



    }

    // 初始化图片
    private void initImage() {
        // 删除原本已经出现的图片
        this.getContentPane().removeAll();

        if(victory()){

            // 显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\code\\Java-leaning\\puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepJLabel = new JLabel("步数：" + step);
        stepJLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepJLabel);

        /*
        // 创建一个图片ImageIcon的对象
        ImageIcon icon = new ImageIcon("D:\\code\\Java-leaning\\puzzlegame\\image\\animal\\animal1\\1.jpg");
        // 创建一个JLable的对象（管理容器）
        JLabel jLabel = new JLabel(icon);
        */

        // 用于加载图片的次数
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){

                // 获取当前要加载图片的序号
                 int num = data[i][j];

                // 创建一个JLable的对象（管理容器），并把ImageIcon对象添加进去
                // 相对路径，是相对于当前想买目开始的，我的就是Java-learning
                JLabel jLabel = new JLabel(new ImageIcon(path+ num +".jpg"));

                // 设置图片的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                // // 把管理容器添加到界面中
                // this.add(jlabel);
                // 获取隐藏的容器，并把管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        // 把背景图片添加到界面中
        this.getContentPane().add(background);

        // 刷新界面
        this.getContentPane().repaint();



    }

    // 初始化菜单
    private void initJMemuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu funcationJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");
        JMenu changeImage = new JMenu("更换图片");

        // 将每个选项下面的条目添加到选项当中
        funcationJmenu.add(replayItem);
        funcationJmenu.add(reLoginItem);
        funcationJmenu.add(closeItem);
        // JMenu中还能添加JMenu
        funcationJmenu.add(changeImage);

        // 这些条目添加到JMenu(更换图片)选项中
        changeImage.add(girl);
        changeImage.add(sport);
        changeImage.add(animal);

        aboutJmenu.add(accountItem);



        // 将菜单的两个选项添加到菜单中
        jMenuBar.add(funcationJmenu);
        jMenuBar.add(aboutJmenu);


        // 给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);


        accountItem.addActionListener(this);

        girl.addActionListener(this);
        sport.addActionListener(this);
        animal.addActionListener(this);



        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    // 初始化界面
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

        // 取消默认的居中放置，只有取消了，才会按照xy轴的形式去放置图片
        this.setLayout(null);
        // 给整个界面添加监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {


        // 返回按下的键的位置
        int code = e.getKeyCode();
        if (code == 65){
            // 把界面的图片全部删除
            this.getContentPane().removeAll();
            // 加载一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            // 加载背景图片
            // 添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            // 把背景图片添加到界面当中
            this.getContentPane().add(background);
            // 刷新界面
            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            return;
        }

        int code = e.getKeyCode();
        if (code == 39){
            // 左移动
            if(y == 0){
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        }else if (code == 38){
            // 把空白方块下方的方块往上移动
            // 把空白方块下方的数值赋值给空白方块
            if(x == 3){
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            // x 是空白方块的行坐标，往上一次就++
            x++;
            step++;
            // 调用最新的方法最新的数字加载图片
             initImage();
        }else if (code == 37){
            // 空白区域左方的数字往右移动
            if(y == 3){return;}
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();

        }else if (code == 40){
            if(x == 0){return;}
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        }else if (code == 65){  // 按A，可以看到完整图片
            initImage();
        }else if (code == 87){  // w 快捷键来完成
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            // 胜利后数值为0的方块应该在右下角
            x = 3;
            y = 3;
            initImage();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的对象
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重载游戏");
            // 计步器清0
            step = 0;
            if (obj == girl){
                Random random = new Random();
                int num = random.nextInt(12) + 1;
                path = "puzzlegame\\image\\girl\\girl" + num + "\\";
            }else if (obj == animal){
                Random random = new Random();
                int num = random.nextInt(8) + 1;
                path = "puzzlegame\\image\\animal\\animal" + num + "\\";
            }else if(obj == sport){
                Random random = new Random();
                int num = random.nextInt(10) + 1;
                path = "puzzlegame\\image\\sport\\sport" + num + "\\";
            }

            // 重新打乱图片出现的数字顺序
            initData();
            // 重新加载图片
            initImage();

        }else if (obj == reLoginItem){
            System.out.println("重新登录");
            // 关闭当前游戏的界面
            this.setVisible(false);
            // 显示登录界面
            new LoginJFrame();
        }else if (obj == closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if (obj == accountItem){
            System.out.println("公众号");
            // 创建一个弹框对象
            JDialog jdialog = new JDialog();
            // 创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\damie.jpg"));
            jLabel.setBounds(0, 0, 420, 420);
            // 把图片添加到弹框当中
            jdialog.getContentPane().add(jLabel);
            // 设置弹框的大小
            jdialog.setSize(1000, 1000);
            // 让弹框置顶
            jdialog.setAlwaysOnTop(true);
            // 让弹框居中
            jdialog.setLocationRelativeTo(null);
            // 显示弹框
            jdialog.setVisible(true);

        }else if (obj == girl){
            System.out.println("美女图片");
            Random random = new Random();
            int num = random.nextInt(12) + 1;
            path = "puzzlegame\\image\\girl\\girl" + num + "\\";
            initData();
            initImage();
        }else if (obj == animal){
            System.out.println("动物图片");
            Random random = new Random();
            int num = random.nextInt(8) + 1;
            path = "puzzlegame\\image\\animal\\animal" + num + "\\";
            initData();
            initImage();
        }else if (obj == sport){
            System.out.println("运动图片");
            Random random = new Random();
            int num = random.nextInt(10) + 1;
            path = "puzzlegame\\image\\sport\\sport" + num + "\\";
            initData();
            initImage();
        }

    }

    // 用于判断胜利
    public boolean victory(){
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                if(data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;

    }


}
