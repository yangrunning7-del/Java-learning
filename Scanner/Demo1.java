package Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){

        // 创建一个扫描对象，用于接收键盘的数据的输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next的方式来接收");

        // 判断用户有没有输入数据
        if (scanner.hasNext()){
            // 使用next方式来获取
            String s = scanner.next();
            System.out.println("输出的内容位" + s);
        }


        //  凡是属于io流的类用完要关闭，不然会占用资源
        scanner.close();
    }
}
